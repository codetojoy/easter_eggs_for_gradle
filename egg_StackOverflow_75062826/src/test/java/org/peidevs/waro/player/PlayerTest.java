package org.peidevs.waro.player;

import org.peidevs.waro.strategy.*;
import org.peidevs.waro.table.Hand;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.*;

public class PlayerTest {

    @Test
    public void testReset_Basic() {
        var strategy = new MaxCard();
        int maxCard = 40;
        int prizeCard = 10;
        var cards = IntStream.range(1,5).boxed().toList();
        var hand = new Hand(cards);
        var player = new Player("Randy", strategy, maxCard, hand);
        var bid = player.getBid(prizeCard);
        player = player.winsRound(bid);
        assertEquals(3, player.getNumCardsInHand());
        assertEquals(1, player.getPlayerStats().numRoundsWon());
        
        var newCards = IntStream.range(6,8+1).boxed().toList();
        var newHand = new Hand(newCards);
        
        // test
        var result = player.reset(newHand);
        
        assertEquals(3, result.getNumCardsInHand());
        assertEquals(0, result.getPlayerStats().numRoundsWon());
    }
    
    @Test
    public void testGetBid_Basic() {
        var strategy = new MaxCard();
        int maxCard = 40;
        int prizeCard = 10;
        var cards = IntStream.range(1,5).boxed().toList();
        var hand = new Hand(cards);
        var player = new Player("Randy", strategy, maxCard, hand);

        // test
        var bid = player.getBid(prizeCard);
        
        assertEquals(player, bid.bidder());
        assertEquals(4, bid.offer());
        assertEquals(prizeCard, bid.prizeCard());
   }
}
