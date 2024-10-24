import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {

    Vehicle[] vehicles;
    int currentSize = 0;
    int maxSize = 0;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("///////////////////////////////////////");
        System.out.println("Vehicle App V2.0");
        System.out.println("///////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println("Please wait while the system loads...");
        System.out.println();
        Driver driver = new Driver();
     //Delay for 3 seconds
      try {
          TimeUnit.SECONDS.sleep(3);
      }
      catch (Exception e) {}
        driver.setup();

        driver.addVehicle(driver.currentSize);
        driver.listVehicles();
        driver.addVehicle(driver.currentSize);
      //  driver.printVehicle();
        driver.listVehicles();

        // driver.checkBestVehicle();
        System.out.print("Exiting System... ");
    } // End of Main

    public void setup() {
        System.out.print("Please Enter the Number of Vehicles : ");
        maxSize = input.nextInt();
        vehicles = new Vehicle[maxSize];
        System.out.println("Max Number of Vehicles : " +
                "[" + vehicles.length + "]");

    } // End of setup method

    public void addVehicle(int index) {
        input.nextLine();
        System.out.println("Add a Vehicle... ");
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

        vehicles[index] = new Vehicle(make, model, price,
                passengers,wheels);

        currentSize++;
    } // End of addVehicle()

    public String listVehicles() {
        String listOfVehicles = "";
        for (int i = 0; i < currentSize; i++) {
            listOfVehicles += i + ": " + vehicles[i] + "\n";
        }
        return listOfVehicles;
    }

    public void printVehicle() {

        //System.out.println(car);
    } // End of printVehicle()

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

} // End of Driver Class
