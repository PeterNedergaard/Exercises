package com.company;

public class Print {
    private String MSG;
    private String CURRENCY;
    private VAT vat;

    public Print(String MSG, String CURRENCY) {
        vat = new VAT();

        this.MSG = MSG;
        this.CURRENCY = CURRENCY;

        System.out.printf("Du betaler %.2f%3s i %s%n",vat.doVAT(),this.CURRENCY,this.MSG);
    }
}
