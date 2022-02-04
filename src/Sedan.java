public class Sedan extends Automobile {

    public SedanTypes type;

    public int numCylinders;

    public double horsepower;

    public SedanTypes getType() {

        return type;

    }

    public void setType(SedanTypes type) {

        this.type = type;

    }

    public int getNumCylinders() {

        return numCylinders;

    }

    public void setNumCylinders(int numCylinders) {

        this.numCylinders = numCylinders;

    }

    public double getHorsepower() {

        return horsepower;

    }

    public void setHorsepower(double horsepower) {

        this.horsepower = horsepower;

    }

    @Override

    public String toString() {

        return "Sedan [type=" + type + ", numCylinders=" + numCylinders + ", horsepower=" + horsepower + "]";

    }

    public String getClassName() {

        return this.getClass().getName();

    }



}