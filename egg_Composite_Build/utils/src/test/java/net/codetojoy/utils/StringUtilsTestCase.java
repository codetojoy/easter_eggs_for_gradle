
package net.codetojoy.utils;

import org.junit.*;
import static org.junit.Assert.*;

public class StringUtilsTestCase {
    private StringUtils stringUtils = new StringUtils();

    @Test
    public void testSafeIsNotEmpty_Empty() {
        String s = "";

        // test
        boolean result = stringUtils.safeIsNotEmpty(s);

        assertFalse(result);
    }

    @Test
    public void testSafeIsNotEmpty_Null() {
        String s = null;

        // test
        boolean result = stringUtils.safeIsNotEmpty(s);

        assertFalse(result);
    }

    @Test
    public void testSafeIsNotEmpty_Basic() {
        String s = "quick brown fox";

        // test
        boolean result = stringUtils.safeIsNotEmpty(s);

        assertTrue(result);
    }
}
