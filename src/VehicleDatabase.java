import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class SortbyManufacturerSedan implements Comparator<Sedan> {

    public int compare(Sedan a, Sedan b)
    {
        return a.manufacturer.compareTo(b.manufacturer);
    }
}

class SortbyManufacturerTruck implements Comparator<Truck> {

    public int compare(Truck a, Truck b)
    {
        return a.manufacturer.compareTo(b.manufacturer);
    }
}

class SortbynameBicycle implements Comparator<Bicycle> {

    public int compare(Bicycle a, Bicycle b)
    {
        return a.manufacturer.compareTo(b.manufacturer);
    }
}

class SortbynameMotorCycle implements Comparator<MotorCycle> {

    public int compare(MotorCycle a, MotorCycle b)
    {
        return a.manufacturer.compareTo(b.manufacturer);
    }
}

public class VehicleDatabase {
    static int rows;
    static ArrayList<Sedan> sedan = new ArrayList<>();
    static ArrayList<Truck> truck = new ArrayList<>();
    static ArrayList<MotorCycle> cycle = new ArrayList<>();
    static ArrayList<Bicycle> bicycle = new ArrayList<>();



    public static void readDatabase(String fileName) {
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line = br.readLine();
            rows= Integer.parseInt(line);
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                switch(data[0]) {
                    case "Sedan":
                        Sedan sedanObj = new Sedan();
                        sedanObj.setNumWheels(Integer.parseInt(data[2]));
                        sedanObj.setType(SedanTypes.Large);
                        sedanObj.setManufacturer(data[1]);
                        sedanObj.setNumCylinders(Integer.parseInt(data[3]));
                        sedanObj.setNumSeats(Integer.parseInt(data[4]));
                        sedanObj.setModel(data[8]);
                        sedanObj.setHorsepower(Double.parseDouble(data[7]));
                        sedanObj.setNumCylinders(Integer.parseInt(data[6]));
                        sedanObj.setNumVehicle(rows);
                        sedan.add(sedanObj);
                        break;
                    case "Truck":
                        Truck truckObj = new Truck();
                        truckObj.setNumWheels(Integer.parseInt(data[2]));
                        truckObj.setType(TruckTypes.Semi);
                        truckObj.setManufacturer(data[1]);
                        truckObj.setGrossVehicleMass(Integer.parseInt(data[4]));
                        truckObj.setNumSeats(Integer.parseInt(data[4]));
                        truckObj.setModel(data[8]);
                        truckObj.setMpg(Double.parseDouble(data[7]));
                        truckObj.setNumAxies(Integer.parseInt(data[6]));
                        truckObj.setNumVehicle(rows);
                        truck.add(truckObj);
                        break;
                    case "MotorCycle":
                        MotorCycle cycleObj = new MotorCycle();
                        cycleObj.setHorsepower(Integer.parseInt(data[5]));
                        cycleObj.setManufacturer(data[1]);
                        cycleObj.setModel(data[0]);
                        cycleObj.setMpg(Double.parseDouble(data[4]));
                        cycleObj.setNumVehicle(rows);
                        cycleObj.setNumWheels(Integer.parseInt(data[2]));
                        cycleObj.setWeight(Integer.parseInt(data[5]));
                        cycle.add(cycleObj);
                        break;
                    case "Bicycle":
                        Bicycle bicycleObj=new Bicycle();
                        bicycleObj.setCaloriesBurnedPerHour(Integer.parseInt(data[5]));
                        bicycleObj.setManufacturer(data[1]);
                        bicycleObj.setModel(data[0]);
                        bicycleObj.setHasGears(Boolean.parseBoolean(data[6]));
                        bicycleObj.setHasSuspensions(Boolean.parseBoolean(data[7]));
                        bicycleObj.setNumVehicle(rows);
                        bicycleObj.setNumWheels(Integer.parseInt(data[2]));
                        bicycleObj.setWeight(Integer.parseInt(data[5]));
                        bicycle.add(bicycleObj);
                        break;
                    default:
                        System.out.println("Invalid data, please check input file");
                        break;
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{
        readDatabase(args[0]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Comparator<Sedan> s = new Comparator<Sedan>() {
            public int compare(Sedan u1, Sedan u2) {
                return u1.getManufacturer().compareTo(u2.getManufacturer());
            }
        };

        Comparator<Truck> t = new Comparator<Truck>() {
            public int compare(Truck u1, Truck u2) {
                return u1.getManufacturer().compareTo(u2.getManufacturer());
            }
        };
        Comparator<Bicycle> b = new Comparator<Bicycle>() {
            public int compare(Bicycle u1, Bicycle u2) {
                return u1.getManufacturer().compareTo(u2.getManufacturer());
            }
        };
        Comparator<MotorCycle> m = new Comparator<MotorCycle>() {
            public int compare(MotorCycle u1, MotorCycle u2) {
                return u1.getManufacturer().compareTo(u2.getManufacturer());
            }
        };
        while(true) {
            System.out.println("1.Display All Data\n2.Display Specific Vehicles\n3.Sort\n4.Search\n5.Exit");
            int choice = Integer.parseInt(br.readLine());
            int i=0;

            switch(choice){
                case 1:
                    display(sedan);
                    display(truck);
                    display(cycle);
                    display(bicycle);
                    break;
                case 2:
                    System.out.println("Enter vehicle type");
                    String name = br.readLine();
                    switch(name) {
                        case "Sedan":
                            display(sedan);
                            break;
                        case "Truck":
                            display(truck);
                            break;
                        case "Bicycle":
                            display(bicycle);
                            break;
                        case "MotorCycle":
                            display(cycle);
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Enter vehicle type");
                    String name3 = br.readLine();
                    switch(name3) {
                        case "Sedan":
                            Collections.sort(sedan, new SortbyManufacturerSedan());
                            break;
                        case "Truck":
                            Collections.sort(truck, new SortbyManufacturerTruck());
                            break;
                        case "Bicycle":
                            Collections.sort(bicycle, new SortbynameBicycle());
                            break;
                        case "MotorCycle":
                            Collections.sort(cycle, new SortbynameMotorCycle());
                            break;

                    }
                    break;
                case 4:
                    System.out.println("Enter vehicle type for searching");
                    String name1 = br.readLine();
                    System.out.println("Enter manufacturing");
                    String manu=br.readLine();
                    int ind=-1;
                    switch(name1) {
                        case "Sedan":
                            ind=-1;
                            for( i=0;i<sedan.size();i++) {
                                if(sedan.get(i).getManufacturer()==manu) {
                                    ind=i;
                                }
                            }
                            if(ind!=-1) {
                                int index = Collections.binarySearch(sedan,sedan.get(ind), s);
                                System.out.println("Found at "+index);
                            }
                            else {
                                System.out.println("not found");
                            }
                            break;
                        case "Truck":
                            ind=-1;
                            for( i=0;i<truck.size();i++) {
                                if(truck.get(i).getManufacturer()==manu) {
                                    ind=i;
                                }
                            }
                            if(ind!=-1) {
                                int index = Collections.binarySearch(truck,truck.get(ind), t);
                                System.out.println("Found at "+index);
                            }
                            else {
                                System.out.println("not found");
                            }
                            break;
                        case "Bicycle":
                            ind=-1;
                            for( i=0;i<bicycle.size();i++) {
                                if(bicycle.get(i).getManufacturer()==manu) {
                                    ind=i;
                                }
                            }
                            if(ind!=-1) {
                                int index = Collections.binarySearch(bicycle,bicycle.get(ind), b);
                                System.out.println("Found at "+index);
                            }
                            else {
                                System.out.println("not found");
                            }
                            break;
                        case "MotorCycle":
                            ind=-1;
                            for( i=0;i<cycle.size();i++) {
                                if(cycle.get(i).getManufacturer()==manu) {
                                    ind=i;
                                }
                            }
                            if(ind!=-1) {
                                int index = Collections.binarySearch(cycle,cycle.get(ind), m);
                                System.out.println("Found at "+index);
                            }
                            else {
                                System.out.println("not found");
                            }
                            break;

                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void display(ArrayList list) {
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }



}

 