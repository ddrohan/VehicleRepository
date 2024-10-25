import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Driver {

    Vehicle[] vehicles;
    int maxVehicles = 0;
    int currentVehicles = 0;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("///////////////////////////////////////");
        System.out.println("Vehicle App V2.0");
        System.out.println("///////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.print("Please wait while the system loads...");
        Driver driver = new Driver();
        //Delay for 3 seconds
        try {
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            System.out.println();
        }
        catch(Exception e) {}

        driver.setup();
        driver.clearScreen();
        driver.addVehicle();
        driver.printVehicles();
        driver.addVehicle();
        driver.printVehicles();

        // driver.checkBestVehicle();
    } // End of Main

    public void setup() {
        System.out.print("Enter Max Number of Vehicles : ");
        maxVehicles = input.nextInt();

        vehicles = new Vehicle[maxVehicles];
        System.out.println("Max Vehicles : ["+ vehicles.length + "]");
    }

    public void addVehicle() {
        System.out.println("Please Enter Vehicle Details...");
        input.nextLine();
        System.out.print("Enter Make : ");
        String make = input.nextLine();
        System.out.print("Enter Model : ");
        String model = input.nextLine();
        System.out.print("Enter Price : ");
        float price = input.nextFloat();
        System.out.print("Enter Passengers : ");
        int passengers = input.nextInt();
        System.out.print("Enter Wheels : ");
        int wheels = input.nextInt();

        vehicles[currentVehicles] = new Vehicle(make, model, price,
                passengers,wheels);
        currentVehicles++;

    } // End of addVehicle()

    public void printVehicles() {
        System.out.println("////Vehicle Details////");
        System.out.println(getlVehiclesList());
    } // End of printVehicle()

    public String getlVehiclesList() {
        String listOfVehicles = "";
        for (int i = 0; i < currentVehicles; i++) {
            listOfVehicles += i + ": " + vehicles[i] + "\n";
        }
        return listOfVehicles;
    } // End of list of Vehicles

public void checkBestVehicle() {
        System.out.print("Enter Number of Passengers : ");
        int numPassengers = input.nextInt();
        System.out.println("Passengers Entered : " + numPassengers);

        if(numPassengers >= 1 && numPassengers <= 2)
            System.out.println("EBike is Best");
        else if(numPassengers >= 3 && numPassengers <= 5)
            System.out.println("Car is Best : ");
        else if(numPassengers >= 6 && numPassengers <= 20)
            System.out.println("Bus is Best : ");
        else
            System.out.println("Sorry, no Vehicle Available");
    } // End of checkBestVehicle method

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
} // End of Driver Class
