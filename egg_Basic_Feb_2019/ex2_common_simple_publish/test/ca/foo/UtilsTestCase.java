
package ca.foo;

import org.junit.*;
import static org.junit.Assert.*;

public class UtilsTestCase {
    @Test
    public void testSafeIsAlphanumeric_null() {
        String s = null;

        // test
        boolean result = new Utils().safeIsAlphanumeric(s);
    
        assertFalse(result); 
    }

    @Test
    public void testSafeIsAlphanumeric_basic() {
        String s = "5150EVH";

        // test
        boolean result = new Utils().safeIsAlphanumeric(s);
    
        assertTrue(result); 
    }
}
