package com.gmail.katerynashpak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void TestValidUser() throws WrongPasswordException,WrongLoginException{

        String login = "validLogin";
        String password = "validPassword1";
        String confirmPassword = "validPassword1";

        User user = new User(login,password,confirmPassword);

        Assertions.assertEquals(login,user.getLogin());
        Assertions.assertEquals(password,user.getPassword());
    }
}
