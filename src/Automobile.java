public class Automobile extends Vehicle {

    public double mpg;

    public int numSeats;

    public String model;

    public double getMpg() {

        return mpg;

    }

    public void setMpg(double mpg) {

        this.mpg = mpg;

    }

    public int getNumSeats() {

        return numSeats;

    }

    public void setNumSeats(int numSeats) {

        this.numSeats = numSeats;

    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        this.model = model;

    }

    @Override

    public String toString() {

        return "Automobile [mpg=" + mpg + ", numSeats=" + numSeats + ", model=" + model + "]";

    }




    public String getClassName() {

        return this.getClass().getName();

    }

//driver function

    public static void main(String[] args)

    {




//declare Automobile Object

        Automobile A1=new Automobile();




//setting values for Automobile Object

        A1.setManufacturer("Hyundai");

        A1.setModel("Creta");

        A1.setMpg(25);

        A1.setNumSeats(5);

        A1.setNumVehicle(5);

        A1.setNumWheels(4);

//displaying Automobile Object

        System.out.println(A1);

    }

}