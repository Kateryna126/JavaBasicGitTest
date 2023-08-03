package com.gmail.katerynashpak;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int errorCount = 0;
        while (errorCount < 3) {
            try {
                System.out.print("Enter login: ");
                String login = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                System.out.print("Confirm password: ");
                String confirmPassword = scanner.nextLine();

                User user = new User(login, password, confirmPassword);
                System.out.println("User created successfully!");

                break;

            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                errorCount++;

            } finally {
                System.out.println("Thank you for using our service.");
            }
        }
        if (errorCount == 3) {
            System.out.println("Too many errors. Exiting program.");

        }

    }
}

