package com.gmail.katerynashpak;

public class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {

        validateLogin(login);
        validatePassword(password, confirmPassword);

        this.login = login;
        this.password = password;

    }

    private void validateLogin(String login) throws WrongLoginException {
        if (login == null) {
            throw new IllegalArgumentException("Login cannot be null.");
        }
        if (login.length() > 20 || !login.matches("[a-zA-Z]+")) {
            throw new WrongLoginException("Login must be no more than 20 characters and contain only letters of the English alphabet.");
        }
    }

    private void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }
        if (confirmPassword == null) {
            throw new IllegalArgumentException("Confirm password cannot be null.");
        }
        if (!password.matches("(?=.*[0-9])(?=.*[a-zA-Z]).{6,25}") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password must contain at least 1 letter and 1 digit and must be between 6 and 25 characters long.");
        }
    }

    public void setLogin(String login) throws WrongLoginException {
        validateLogin(login);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password, String confirmPassword) throws WrongPasswordException {
        validatePassword(password, confirmPassword);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

