package com.gmail.katerynashpak;

public class Main {
    public static void main(String[] args) {
        Smartphones[] phones = new Smartphones[2];
        phones[0] = new Androids();
        phones[1] = new IPhones();

        for (Smartphones phone : phones) {
            phone.call();
            phone.sms();
            phone.internet();
        }

        Androids android = new Androids();
        IPhones iphone = new IPhones();

        android.runLinuxCommands();
        iphone.runIOSApps();
    }
}
