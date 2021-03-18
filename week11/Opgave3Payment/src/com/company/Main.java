package com.company;

public class Main {

    public static void main(String[] args) {
	    Account[] myAccounts = new Account[3];

	    myAccounts[0] = new Account("","Janet");
        myAccounts[1] = new Account("","James");
        myAccounts[2] = new Account("","Mehmet");


        myAccounts[0].setCardNumber("4234120954489197");
        myAccounts[1].setCardNumber("4904344348439820");
        myAccounts[2].setCardNumber("4737470823565213");

        System.out.println();

        System.out.println(myAccounts[0].toString());
        System.out.println(myAccounts[1].toString());
        System.out.println(myAccounts[2].toString());
        //System.out.println(myAccounts[0].sum);
    }
}
