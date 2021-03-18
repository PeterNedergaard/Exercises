package com.company;

public class VAT {
    private int prcVat = 25;
    private Dialog dialog;

    public double doVAT(){
        dialog = new Dialog();

        double VAT = dialog.doDiag() / 100 * prcVat;
        return VAT;
    }
}
