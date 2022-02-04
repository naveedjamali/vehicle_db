
public class Truck extends Automobile {

    public int numAxies;

    public int grossVehicleMass;

    public TruckTypes type;

    public int getNumAxies() {

        return numAxies;

    }

    public void setNumAxies(int numAxies) {

        this.numAxies = numAxies;

    }

    public int getGrossVehicleMass() {

        return grossVehicleMass;

    }

    public void setGrossVehicleMass(int grossVehicleMass) {

        this.grossVehicleMass = grossVehicleMass;

    }

    public TruckTypes getType() {

        return type;

    }

    public void setType(TruckTypes type) {

        this.type = type;

    }

    @Override

    public String toString() {

        return "Truck [numAxies=" + numAxies + ", grossVehicleMass=" + grossVehicleMass + ", type=" + type + "]";

    }

    public String getClassName() {

        return this.getClass().getName();

    }

}


