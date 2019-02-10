
package ca.foo;

import org.junit.*;
import static org.junit.Assert.*;

public class FooServiceTestCase {
    @Test
    public void testSafeIsAlphanumeric_blank() {
        String s = "    ";

        // test
        boolean result = new FooService().safeIsAlphanumeric(s);
    
        assertTrue(result); 
    }

    @Test
    public void testSafeIsAlphanumeric_basic() {
        String s = "5150EVH";

        // test
        boolean result = new FooService().safeIsAlphanumeric(s);
    
        assertTrue(result); 
    }
}
