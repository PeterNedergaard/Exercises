package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Controller controller = new Controller();

        controller.runController();

    }

    /*final static int PRCVAT = 25;
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";

    public static void main(String[] args){
        runController();

    }
    public static void runController() {
        double userIn = doDiag();
        double moms = doVAT(userIn);
        doView(moms,MSG);
    }

    public static double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
    public static double doDiag(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        double number = myScan.nextDouble();
        return number;
    }
    public static void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }*/
}
