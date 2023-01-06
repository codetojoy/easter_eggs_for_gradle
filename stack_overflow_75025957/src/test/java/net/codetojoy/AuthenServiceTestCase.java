
package net.codetojoy;

import org.junit.*;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import java.util.*;
import java.util.stream.*;

public class AuthenServiceTestCase {
    AuthenService as;
    UserRepo ur;

    @Before
    public void init() {
        ur = mock(UserRepo.class);
        as = new AuthenService(ur);
    }

    @Test(expected = UserNotFoundException.class)
    public void authenticate() throws UserNotFoundException {
        when(ur.validate("abc", "123")).thenReturn(false);

        // test
        as.authenticate("abc", "123");
    }
}

