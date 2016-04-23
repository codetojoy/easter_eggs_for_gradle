
package net.codetojoy.service;

import static org.junit.Assert.*;
import org.junit.*;

public class UserServiceTest {
    @Test
    public void testGetDtoVersion() {
        UserService service = new UserService();

        // test
        String result = service.getDtoVersion();

        String expected = "USER_DTO.v.0";
        assertTrue(result.equals(expected));
    }
}

