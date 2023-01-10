package org.peidevs.waro.table;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

import org.apache.commons.lang3.tuple.ImmutablePair;
import com.codepoetics.protonpack.StreamUtils;
import com.google.common.collect.Lists;

import org.peidevs.waro.player.*;

public class Dealer {

    public Table deal(int numPlayers, int numCards, Stream<Player> players) {
        var pair = deal(numCards, numPlayers);
        var hands = pair.getRight();

        // TODO: is there a zip function in JDK ?
        var newPlayers = StreamUtils.zip(players, hands,
                                         (player, hand) -> player.reset(hand)).collect(toList());

        var kitty = pair.getLeft();
        var table = new Table(newPlayers, kitty);

        return table;
    }

    // ------- internal

    // @return pair with kitty and list of other hands
    protected ImmutablePair<Hand,Stream<Hand>> deal(int numCards, int numPlayers) {
        int numGroups = numPlayers + 1; // include kitty
        assertEvenNumberOfCards(numCards, numGroups);

        var deck = buildShuffledDeck(numCards);
        int numCardsPerHand = numCards / numGroups;

        // TODO: is there a way to partition using Java 8 ?
        var hands = Lists.partition(deck, numCardsPerHand);
        var kitty = new Hand(hands.get(0));
        var handsNoKittyList = hands.subList(1, hands.size());
        var handsNoKitty = handsNoKittyList.stream().map(cards -> new Hand(cards));
        var pair = new ImmutablePair<Hand, Stream<Hand>>(kitty, handsNoKitty);

        return pair;
    }

    protected List<Integer> buildShuffledDeck(int numCards) {
        var cards = IntStream.range(1,numCards+1).boxed().collect(toList());
        Collections.shuffle(cards, new Random(new Date().getTime()));
        return cards;
    }

    protected void assertEvenNumberOfCards(int numCards, int numGroups) {
        if ((numCards % numGroups) != 0) {
            throw new IllegalArgumentException("uneven # of cards");
        }
    }
}
