package com.gmail.katerynashpak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testValidUser() throws WrongPasswordException, WrongLoginException {

        String login = "validLogin";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        User user = new User(login, password, confirmPassword);

        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(password, user.getPassword());
    }

    @Test
    public void testInvalidLogin() {

        String login = "invalid login";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        Assertions.assertThrows(WrongLoginException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testInvalidPassword() {

        String login = "validLogin";
        String password = "invalidpassword";
        String confirmPassword = "invalidpassword";

        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testPasswordMatch() {

        String login = "validLogin";
        String password = "validPassword1";
        String confirmPassword = "differentValidPassword1";

        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testLoginLength() {

        String login = "thisLoginIsWayTooLongToBeValid";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        Assertions.assertThrows(WrongLoginException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testLoginContainsNumber() {

        String login = "invalidLogin123";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        Assertions.assertThrows(WrongLoginException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testPasswordTooShort() {

        String login = "validLogin";
        String password = "short";
        String confirmPassword = "short";

        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testPasswordTooLong() {

        String login = "validLogin";
        String password = "thisPasswordIsWayTooLongToBeValid";
        String confirmPassword = "thisPasswordIsWayTooLongToBeValid";

        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void testPasswordNoDigits() {
        // given
        String login = "validLogin";
        String password = "noDigitsHere";
        String confirmPassword = "noDigitsHere";

        // when
        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });

    }
}
