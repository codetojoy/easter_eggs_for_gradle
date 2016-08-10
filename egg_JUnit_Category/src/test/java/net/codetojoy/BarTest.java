
package net.codetojoy;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.experimental.categories.*;

@Category(net.codetojoy.SlowTest.class)
public class BarTest {
    @Test
    public void testAddThem() {
        // test
        char result = new Bar().firstChar("hello there");
  
        assertEquals( (char) 'h', result);
    }
}
