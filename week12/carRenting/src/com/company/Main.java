package com.company;

public class Main {

    public static void main(String[] args) {
	    Garage myGarage = new Garage();

	    Car myGasCar = new GasCar("HD81629","Mazda","MX5",2016,4,98,18);
        Car myDieselCar = new DieselCar("KW19752","Toyota","Yaris",2004,4,false,25);
        Car myElCar = new ElCar("MT10726","Tesla","Roadster",2021,2,200,1000, 135);

        myGarage.addCarsToGarage(myGasCar);
        myGarage.addCarsToGarage(myDieselCar);
        myGarage.addCarsToGarage(myElCar);

        System.out.println(myGarage.toString());
        System.out.println("Total green fee of all cars in the garage: \n" + myGarage.calcGreenFeeGarage() + " DKK");
    }
}
