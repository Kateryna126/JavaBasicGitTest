package com.gmail.katerynashpak;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from an iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from an iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from an iPhone");
    }

    @Override
    public void runIOSApps() {
        System.out.println("Running iOS apps on an iPhone");
    }
}

