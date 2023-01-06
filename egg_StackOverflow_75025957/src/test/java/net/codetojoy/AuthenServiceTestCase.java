
package net.codetojoy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

public class AuthenServiceTestCase {
    AuthenService as;
    UserRepo ur;

    @BeforeEach
    public void init() {
        ur = mock(UserRepo.class);
        as = new AuthenService(ur);
    }

    @Test
    public void authenticate() throws UserNotFoundException {
        when(ur.validate("abc", "123")).thenReturn(false);

        // test
        assertThrows(UserNotFoundException.class, () ->as.authenticate("abc", "123"));
    }
}

