package com.company;

public class ElCar extends Car{
    int batteryCapKWH;
    int maxKm;
    int whPrKm;

    public ElCar(String regNr, String make, String model, int year, int numbOfDoors, int batteryCapKWH, int maxKm, int whPrKm) {
        super(regNr, make, model, year, numbOfDoors);
        this.batteryCapKWH = batteryCapKWH;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double calcGreenFee() {
        double kmPrL = 100/(whPrKm/91.25);

        if (kmPrL >= 20) return 330;
        else if (kmPrL >= 15 && kmPrL < 20) return 1050;
        else if (kmPrL >= 10 && kmPrL < 15) return 2340;
        else if (kmPrL >= 5 && kmPrL < 10) return 5500;
        else if (kmPrL < 5) return 10470;

        else{
            return -1;
        }
    }

    public int getBatteryCapKWH() {
        return batteryCapKWH;
    }

    public void setBatteryCapKWH(int batteryCapKWH) {
        this.batteryCapKWH = batteryCapKWH;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Electric car: " + "\n" +
                "regNr: " + regNr + " | " +
                "make: " + make + " | " +
                "model: " + model + " | " +
                "year: " + year + " | " +
                "numbOfDoors: " + numbOfDoors + " | " +
                "batteryCapKWH: " + batteryCapKWH + " | " +
                "maxKm: " + maxKm + " | " +
                "whPrKm: " +whPrKm + "\n"
                ;
    }
}
