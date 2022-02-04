

public abstract class Vehicle {

    public int numVehicle;

    public String manufacturer;

    public int numWheels;

    public int getNumVehicle() {

        return numVehicle;

    }

    public void setNumVehicle(int numVehicle) {

        this.numVehicle = numVehicle;

    }

    public String getManufacturer() {

        return manufacturer;

    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;

    }

    public int getNumWheels() {

        return numWheels;

    }

    public void setNumWheels(int numWheels) {

        this.numWheels = numWheels;

    }

    @Override

    public String toString() {

        return "Vehicle [numVehicle=" + numVehicle + ", manufacturer=" + manufacturer + ", numWheels=" + numWheels

                + "]";

    }

    public String getClassName() {

        return this.getClass().getName();

    }



}