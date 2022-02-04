public class Bicycle extends TwoWheeler {

    public int caloriesBurnedPerHour;

    public boolean hasGears;

    public boolean hasSuspensions;

    public int getCaloriesBurnedPerHour() {

        return caloriesBurnedPerHour;

    }

    public void setCaloriesBurnedPerHour(int caloriesBurnedPerHour) {

        this.caloriesBurnedPerHour = caloriesBurnedPerHour;

    }

    public boolean isHasGears() {

        return hasGears;

    }

    public void setHasGears(boolean hasGears) {

        this.hasGears = hasGears;

    }

    public boolean isHasSuspensions() {

        return hasSuspensions;

    }

    public void setHasSuspensions(boolean hasSuspensions) {

        this.hasSuspensions = hasSuspensions;

    }

    @Override

    public String toString() {

        return "Bicycle [caloriesBurnedPerHour=" + caloriesBurnedPerHour + ", hasGears=" + hasGears

                + ", hasSuspensions=" + hasSuspensions + "]";

    }



    public String getClassName() {

        return this.getClass().getName();

    }

}



