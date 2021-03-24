package com.company;

public class DieselCar extends Car{
    boolean hasParticleFilter;
    int kmPrL;

    public DieselCar(String regNr, String make, String model, int year, int numbOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(regNr, make, model, year, numbOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calcGreenFee() {
        int result = 0;

        if (kmPrL >= 20 && kmPrL < 50) result = 330+130;
        else if (kmPrL >= 15 && kmPrL < 20) result = 1050+1390;
        else if (kmPrL >= 10 && kmPrL < 15) result = 2340+1850;
        else if (kmPrL >= 5 && kmPrL < 10) result = 5500+2770;
        else if (kmPrL < 5) result = 10470+15260;

        if (!hasParticleFilter) result += 1000;

        return result;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Diesel car: " + "\n" +
                "regNr: " + regNr + " | " +
                "make: " + make + " | " +
                "model: " + model + " | " +
                "year: " + year + " | " +
                "numbOfDoors: " + numbOfDoors + " | " +
                "hasParticleFilter: " + hasParticleFilter + " | " +
                "kmPrL: " + kmPrL + "\n"
                ;
    }
}
