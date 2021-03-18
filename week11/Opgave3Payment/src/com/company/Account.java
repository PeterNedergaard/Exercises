package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Account {
    int sum;
    private String cardNumber; // Jeg har valgt at gøre kortnummeret til en String,
                               // da det er for langt til at være en int, og
                               // det virker mere overskueligt at arbejde med, end en Long.
    private String name;

    public Account(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        // Jeg valgte at gennemløbe kortnummeret fra venstre side,
        // og starte på første ciffer, da dette giver samme resultat
        // som at gennemløbe fra højre side,
        // og starte på andet ciffer.

        int charToInt = 0;
        int doubled = 0;

        for (int i = 0; i < cardNumber.length(); i++) {
            charToInt = Character.getNumericValue(cardNumber.charAt(i));

            if (i % 2 == 0){
                doubled = charToInt * 2;
                String doubledToString = String.valueOf(doubled);

                if(doubled > 9){
                    sum += Character.getNumericValue(doubledToString.charAt(0));
                    sum += Character.getNumericValue(doubledToString.charAt(1));
                } else {
                    sum += Character.getNumericValue(doubledToString.charAt(0));
                }
            } else{
                sum += Character.getNumericValue(cardNumber.charAt(i));
            }
        }

        if (sum % 10 == 0){
            this.cardNumber = cardNumber;
            System.out.println("Cardnumber " + cardNumber + " passed the test, and was successfully added");
        } else {
            this.cardNumber = "invalid";
            System.out.println("Cardnumber " + cardNumber + " failed the test, and was not added");
        }

    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | CardNumber: " + this.cardNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
