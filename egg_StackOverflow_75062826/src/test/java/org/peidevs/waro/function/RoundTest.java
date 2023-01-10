package org.peidevs.waro.function;

import org.peidevs.waro.player.*;
import org.peidevs.waro.strategy.*;
import org.peidevs.waro.table.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.*;

public class RoundTest {

    @Test
    public void testApply_Basic() {
        int numCards = 12;
        int maxCard = numCards;
        var strategy = new MaxCard();
        var players = new ArrayList<Player>();
        
        var h1 = new Hand(List.of(1,2,3));
        var p1 = new Player("p1", strategy, maxCard, h1);

        var h2 = new Hand(List.of(4,5,6));
        var p2 = new Player("p2", strategy, maxCard, h2);

        var h3 = new Hand(List.of(7,8,9));
        var p3 = new Player("p3", strategy, maxCard, h3);
        
        players.add(p1);
        players.add(p2);
        players.add(p3);
        
        int prizeCard = 10;
        
        // test
        var newPlayers = new Round(prizeCard).apply(players.stream()).toList();
        
        assertEquals(3, newPlayers.size());
        assertEquals(2, newPlayers.get(0).getNumCardsInHand());
        assertEquals(2, newPlayers.get(1).getNumCardsInHand());
        assertEquals(2, newPlayers.get(2).getNumCardsInHand());
        assertEquals(1, newPlayers.stream().filter(p -> p.getPlayerStats().numRoundsWon() == 1).count());
        assertEquals(1, newPlayers.stream().filter(p -> p.getPlayerStats().total() == 10).count());
        assertEquals(2, newPlayers.stream().filter(p -> p.getPlayerStats().numRoundsWon() == 0).count());
        assertEquals(2, newPlayers.stream().filter(p -> p.getPlayerStats().total() == 0).count());
    }

    @Test
    public void testGetAllBids_Basic() {
        Round round = new Round();
        int numCards = 12;
        int maxCard = numCards;
        var strategy = new MaxCard();
        var players = new ArrayList<Player>();
        
        var h1 = new Hand(List.of(1,2,3));
        var p1 = new Player("p1", strategy, maxCard, h1);

        var h2 = new Hand(List.of(4,5,6));
        var p2 = new Player("p2", strategy, maxCard, h2);

        var h3 = new Hand(List.of(7,8,9));
        var p3 = new Player("p3", strategy, maxCard, h3);
        
        players.add(p1);
        players.add(p2);
        players.add(p3);
        
        // test
        var result = round.getAllBids(players.stream(), 10);
        
        assertEquals(3, result.size());
    }
    
    @Test
    public void testFindWinningBid_Basic() {
        var round = new Round();
        int maxCard = 50;
        var strategy = new MaxCard();
        
        var p1 = new Player("Beethoven", strategy, maxCard, new Hand());
        var p2 = new Player("Chopin", strategy, maxCard, new Hand());
        var p3 = new Player("Mozart", strategy, maxCard, new Hand());
        
        int prizeCard = 20;
        var bids = new ArrayList<Bid>();
        bids.add( new Bid(prizeCard, 10, p1) );
        bids.add( new Bid(prizeCard, 12, p2) );
        bids.add( new Bid(prizeCard, 14, p3) );
        
        // test
        var result = round.findWinningBid(bids);
        
        assertEquals("Mozart", result.bidder().getName());
    }
}
