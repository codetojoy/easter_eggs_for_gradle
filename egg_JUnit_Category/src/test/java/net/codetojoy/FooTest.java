
package net.codetojoy;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.experimental.categories.*;

@Category(net.codetojoy.FastTest.class)
public class FooTest {
    @Test
    public void testAddThem() {
        int a = 2;
        int b = a;

        // test
        int result = new Foo().addThem(a,b);
  
        assertEquals(4, result);
    }
}
