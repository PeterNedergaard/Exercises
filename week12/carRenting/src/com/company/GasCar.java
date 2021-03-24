package com.company;

public class GasCar extends Car{
    int octaneNumb;
    int kmPrL;

    public GasCar(String regNr, String make, String model, int year, int numbOfDoors, int octaneNumb, int kmPrL) {
        super(regNr, make, model, year, numbOfDoors);
        this.octaneNumb = octaneNumb;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calcGreenFee() {
        if (kmPrL >= 20 && kmPrL < 50) return 330;
        else if (kmPrL >= 15 && kmPrL < 20) return 1050;
        else if (kmPrL >= 10 && kmPrL < 15) return 2340;
        else if (kmPrL >= 5 && kmPrL < 10) return 5500;
        else if (kmPrL < 5) return 10470;

        else{
            return -1;
        }

    }

    public int getOctaneNumb() {
        return octaneNumb;
    }

    public void setOctaneNumb(int octaneNumb) {
        this.octaneNumb = octaneNumb;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Gas car: " + "\n" +
                "regNr: " + regNr + " | " +
                "make: " + make + " | " +
                "model: " + model + " | " +
                "year: " + year + " | " +
                "numbOfDoors: " + numbOfDoors + " | " +
                "octaneNumb: " + octaneNumb + " | " +
                "kmPrL: " + kmPrL + "\n"
                ;
    }
}
