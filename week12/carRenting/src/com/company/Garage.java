package com.company;

import java.util.ArrayList;

public class Garage {
    String garageName;
    ArrayList<Car> cars = new ArrayList<>();

    public void addCarsToGarage(Car car){
        cars.add(car);
    }

    public double calcGreenFeeGarage(){
        int sum = 0;

        for (Car c : cars) {
            sum += c.calcGreenFee();
        }

        return sum;
    }

    @Override
    public String toString(){
        String print = "";

        for (Car c : cars) {
            print += c.toString() + "\n";
        }

        return print;
    }
}
