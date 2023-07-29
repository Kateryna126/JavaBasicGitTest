package com.gmail.katerynashpak;

class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from an Android phone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from an Android phone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from an Android phone");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Running Linux commands on an Android phone");
    }
}
