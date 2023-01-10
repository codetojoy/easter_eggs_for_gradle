package org.peidevs.waro.table;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.*;

public class HandTest {
    
    @Test
    public void testSelect_Basic() {
        var cards = IntStream.range(1,10+1).boxed().toList();
        var hand = new Hand(cards);
        
        // test
        var result = hand.select(5);
        
        assertEquals(9, result.cardsAsIntStream().boxed().count());
    }
    
    @Test
    public void testSelect_Illegal() {
        var cards = IntStream.range(1,10+1).boxed().toList();
        var hand = new Hand(cards);
        
        // test
        assertThrows(IllegalArgumentException.class, () -> hand.select(18));
    }
    
}
