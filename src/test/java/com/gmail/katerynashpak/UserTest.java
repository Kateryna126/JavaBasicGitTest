package com.gmail.katerynashpak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void TestValidUser() throws WrongPasswordException, WrongLoginException {

        String login = "validLogin";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        User user = new User(login, password, confirmPassword);

        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(password, user.getPassword());
    }

    @Test
    public void TestInvalidLogin() {

        String login = "invalid login";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        Assertions.assertThrows(WrongLoginException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }

    @Test
    public void TestInvalidPassword() {

        String login = "validLogin";
        String password = "invalidpassword";
        String confirmPassword = "invalidpassword";

        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(login, password, confirmPassword);
        });
    }
}
