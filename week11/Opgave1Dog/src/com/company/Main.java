package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog myDog = new Dog("Hund","Lars");
        Dog myDogsOffspring = new Dog("Lille Hund","Lars");


	    myDog.setOffSpring(myDogsOffspring);
        System.out.println(myDog.getOffSpring().get(0).getName());

        System.out.println("The dog " + myDog.getName() + " is owned by " + myDog.getOwner().name);



        //feed attempt 1. The dog should be hungry
        myDog.feedDog();

        //feed attempt 2. The dog should not be hungry
        myDog.feedDog();

        //feed attempt 3. The dog should be hungry
        myDog.feedDog();

    }
}
