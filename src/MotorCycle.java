public class MotorCycle extends TwoWheeler {

    public double mpg;

    public int horsepower;

    public double getMpg() {

        return mpg;

    }

    public void setMpg(double mpg) {

        this.mpg = mpg;

    }

    public int getHorsepower() {

        return horsepower;

    }

    public void setHorsepower(int horsepower) {

        this.horsepower = horsepower;

    }

    @Override

    public String toString() {

        return "MotorCycle [mpg=" + mpg + ", horsepower=" + horsepower + "]";

    }




    public String getClassName() {

        return this.getClass().getName();

    }





    public static void main(String[] args)




    {





    }

}