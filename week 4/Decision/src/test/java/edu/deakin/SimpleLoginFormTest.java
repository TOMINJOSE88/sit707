package edu.deakin;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleLoginFormTest {

    SimpleLoginForm form = new SimpleLoginForm();

    @Test
    public void testEmptyUsername() {
        assertEquals("Error: Enter username", form.login("", "password123"));
    }

    @Test
    public void testEmptyPassword() {
        assertEquals("Error: Enter password", form.login("admin", ""));
    }

    @Test
    public void testEmptyUsernameAndPassword() {
        assertEquals("Error: Enter username", form.login("", ""));
    }

    @Test
    public void testInvalidCredentials() {
        assertEquals("Error: Invalid credentials", form.login("user", "pass"));
    }

    @Test
    public void testCorrectUsernameWrongPassword() {
        assertEquals("Error: Invalid credentials", form.login("admin", "wrongpass"));
    }

    @Test
    public void testWrongUsernameCorrectPassword() {
        assertEquals("Error: Invalid credentials", form.login("user", "password123"));
    }

    @Test
    public void testSuccessfulLogin() {
        assertEquals("Success", form.login("admin", "password123"));
    }
}
