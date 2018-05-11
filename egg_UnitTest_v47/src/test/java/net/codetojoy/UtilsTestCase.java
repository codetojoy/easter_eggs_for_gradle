
package net.codetojoy;

import org.junit.*;
import static org.junit.Assert.*;

public class UtilsTestCase {
    private static final int PATHOGEN_DELAY_IN_MILLIS = 2000;

    @Test
    public void testReverse() {
        String s = "abcd";

        // test
        String result = new Utils().reverse(s);

        assertEquals("dcba", result);
    }

    @Test
    public void testPathogen_one() throws Exception {
       Thread.sleep(PATHOGEN_DELAY_IN_MILLIS); 
        assertEquals(4, 2+2);
    }

    @Test
    public void testPathogen_two() throws Exception {
       Thread.sleep(PATHOGEN_DELAY_IN_MILLIS); 
        assertEquals(4, 2+2);
    }
}
