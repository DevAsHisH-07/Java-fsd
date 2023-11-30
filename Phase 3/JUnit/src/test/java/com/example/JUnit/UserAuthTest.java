package com.example.JUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserAuthTest {

    @Test
    public void testValidAuthentication() {
        UserAuth userAuth = new UserAuth();
        assertTrue(userAuth.authenticate("admin", "password"));
    }

    @Test
    public void testInvalidUsername() {
        UserAuth userAuth = new UserAuth();
        assertFalse(userAuth.authenticate("invalidUser", "password"));
    }

    @Test
    public void testInvalidPassword() {
        UserAuth userAuth = new UserAuth();
        assertFalse(userAuth.authenticate("admin", "invalidPassword"));
    }

    @Test
    public void testInvalidCredentials() {
        UserAuth userAuth = new UserAuth();
        assertFalse(userAuth.authenticate("invalidUser", "invalidPassword"));
    }
}
