package com.company;

public abstract class Car {
    String regNr;
    String make;
    String model;
    int year;
    int numbOfDoors;

    public Car(String regNr, String make, String model, int year, int numbOfDoors) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.year = year;
        this.numbOfDoors = numbOfDoors;
    }


    public abstract double calcGreenFee();


    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumbOfDoors() {
        return numbOfDoors;
    }

    public void setNumbOfDoors(int numbOfDoors) {
        this.numbOfDoors = numbOfDoors;
    }
}
