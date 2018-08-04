
package net.codetojoy.tests;

import org.junit.*;
import static org.junit.Assert.*;

import net.codetojoy.service.FooService;

public class FooServiceTestCase {
    private FooService fooService = new FooService();

    @Test
    public void testCanary() {
        assertEquals(4, 2+2);
    }
}
