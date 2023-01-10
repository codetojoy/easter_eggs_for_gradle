package org.peidevs.waro.table;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

public class Hand {
    private final List<Integer> cards;
    
    public Hand() {
        this(new ArrayList<>());
    }
    
    public Hand(List<Integer> cards) {
        this.cards = Collections.unmodifiableList(cards);
    }

    public String toString() {
        return cards.stream().map(i->i.toString()).collect(joining(", "));
    }
    
    public IntStream cardsAsIntStream() {
        return cards.stream().mapToInt(i->i);        
    }    
    
    public Hand select(int card) {
        Hand newHand = null;
        
        if (cards.contains(card)) {
            var newCards = cardsAsIntStream().filter(c -> c != card).boxed().toList();
            newHand = new Hand(newCards);
        } else {
            throw new IllegalArgumentException("illegal card : " + card);
        }
        
        return newHand;
    }
}
