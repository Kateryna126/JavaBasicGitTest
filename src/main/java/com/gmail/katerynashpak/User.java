package com.gmail.katerynashpak;

public class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        if (login.length() > 20 || !login.matches("[a-zA-Z]+")) {
            throw new WrongLoginException("Login must be no more than 20 characters and contain only letters of the English alphabet.");
        }
        if (!password.matches("(?=.*[0-9])(?=.*[a-zA-Z]).{6,25}") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password must contain at least 1 letter and 1 digit and must be between 6 and 25 characters long.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match.");
        }
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
