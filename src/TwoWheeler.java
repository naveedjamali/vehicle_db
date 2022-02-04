


public abstract class TwoWheeler extends Vehicle {

    public int weight;

    public String model;

    public int getWeight() {

        return weight;

    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        this.model = model;

    }

    @Override

    public String toString() {

        return "TwoWheeler [weight=" + weight + ", model=" + model + "]";

    }



    public String getClassName() {

        return this.getClass().getName();

    }

}

