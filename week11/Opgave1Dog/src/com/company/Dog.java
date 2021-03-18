package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog {
    private String name;
    private Owner owner;
    private boolean isHungry = true;
    private ArrayList<Dog> offSpring = new ArrayList<>();
    private int numbOfOffspring = 3;

    public Dog(String name, String owner){
        this.owner = new Owner(owner);
        this.name = name;

    }


    public void feedDog()
    {
        if (this.isHungry){
            System.out.println("Dog is hungry, and will now be fed");
            this.isHungry = false;
        } else {
            System.out.println("Dog is not hungry, and will not be fed");
            this.isHungry = true;
        }
    }


    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(Dog dog) {
        if(offSpring.size() >= numbOfOffspring) return;
        offSpring.add(dog);
    }









    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
