package org.peidevs.waro.table;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.*;

import org.peidevs.waro.player.*;
import org.peidevs.waro.strategy.*;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class DealerTest {

    @Test
    public void testDeal_Table_Basic() {
        var dealer = new Dealer();

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

        var numPlayers = players.size();

        // test (use new numCards value)
        var table = dealer.deal(numPlayers, 20, players.stream());

        assertEquals(5, table.kitty().cardsAsIntStream().count());
        assertEquals(5, table.players().get(0).getNumCardsInHand());
        assertEquals(5, table.players().get(1).getNumCardsInHand());
        assertEquals(5, table.players().get(2).getNumCardsInHand());
    }

    @Test
    public void testDeal_Basic() {
        var dealer = new Dealer();
        int numCards = 40;
        int numPlayers = 4;

        // test
        var pair = dealer.deal(numCards, numPlayers);

        var kitty = pair.getLeft();
        var hands = pair.getRight();
        var handList = hands.toList();
        assertEquals(8, kitty.cardsAsIntStream().count());
        assertEquals(8, handList.get(0).cardsAsIntStream().count());
        assertEquals(8, handList.get(1).cardsAsIntStream().count());
        assertEquals(8, handList.get(2).cardsAsIntStream().count());
        assertEquals(8, handList.get(3).cardsAsIntStream().count());
    }

    @Test
    public void testDeal_Uneven() {
        var dealer = new Dealer();
        int numCards = 42;
        int numPlayers = 4;

        // test
        assertThrows(IllegalArgumentException.class, () -> dealer.deal(numCards, numPlayers));
    }

    @Test
    public void testBuildShuffledDeck() {
        var dealer = new Dealer();
        int numCards = 4;

        // test
        var result = dealer.buildShuffledDeck(numCards);

        assertEquals(4, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        }
}
