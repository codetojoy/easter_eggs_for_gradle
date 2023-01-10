package org.peidevs.waro.strategy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.*;

public class MaxCardTest {

    @Test
    public void testSelectCard() {
        var strategy = new MaxCard();
        int maxCard = 50;
        int prizeCard = 10;
        int handSize = 20;
        IntStream hand = IntStream.range(1,handSize+1).boxed().mapToInt(i -> i);
        
        // test 
        int result = strategy.selectCard(prizeCard, hand, maxCard);
      
        assertEquals(handSize, result);
    }

}
