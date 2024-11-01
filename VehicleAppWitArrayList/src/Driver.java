import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Driver {

    CarStore carStore;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.setup();
        driver.clearScreen();
        driver.runMenu();
    } // End of Main

    ///////////////////////////////////////////////////////
    private int displayMenu(){
        clearScreen(); // Only works at console
        System.out.println("/////////////////////////");
        System.out.print("""
               Car Store Menu
               ---------
                  1) List Car Store Vehicles
                  2) Add a Vehicle
                  3) Find Most Expensive Vehicle
                  4) Search for Vehicle (Registration)
                  5) Update Vehicle Price
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        System.out.println("/////////////////////////");
        return option;
    }

    ///////////////////////////////////////////////////////
    private void runMenu(){
        int option = displayMenu();

        while (option != 0){

            switch (option){
                case 1 -> printVehicles();
                case 2 -> addVehicle();
                case 3 -> findMostExpensive();
                case 4 -> findVehicleReg();
                case 5 -> updatePrice();
                case -88 -> dummyData();
                default -> System.out.println("Invalid option entered: " + option);
            }

            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = displayMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting System...bye");
        System.exit(0);
    }

    private void updatePrice() {
        input.nextLine(); // Bug fix
        System.out.print("Enter Reg : ");
        String reg = input.nextLine();
        System.out.print("Enter New Price : ");
        float price = input.nextFloat();

        boolean isChanged = carStore.updatePrice(price,reg);

        if (isChanged){
            System.out.println("Update Successful..... ");
        }
        else{
            System.out.println("Update NOT Successful.....");
        }
    }

    private void findVehicleReg() {
        System.out.println("///////////////////////////////////////");
        System.out.println("Search Vehicle Registration");
        System.out.println("///////////////////////////////////////");
        input.nextLine(); // Required for bug in Scanner Class
        System.out.print("Enter Reg to Search for =>>");
        String reg = input.nextLine();

        Vehicle foundVehicle = carStore.find(reg);

        if(foundVehicle != null)
            System.out.print(foundVehicle);
        else
            System.out.print("No Vehicle found with Reg : " + reg);
    }

    private void findMostExpensive() {
        System.out.println("///////////////////////////////////////");
        System.out.println("Most Expensive Vehicle");
        System.out.println("///////////////////////////////////////");

        Vehicle mostExpensiveVehicle = carStore.getMostExpensiveVehicle();
        if (mostExpensiveVehicle != null) {
            System.out.println("The most expensive " +
                    "Vehicle is:  " + mostExpensiveVehicle);
        }
        else{
            System.out.println("There are no Vehicles in the Car Store.");
        }
    }

    ///////////////////////////////////////////////////////
    public void setup() {
        System.out.println("///////////////////////////////////////");
        System.out.println("Vehicle App V3.0");
        System.out.println("///////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.print("Please wait while the system loads...");
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

        System.out.print("Enter Max Number of Vehicles : ");
        int maxVehicles = input.nextInt();

        carStore = new CarStore(maxVehicles);

    } // End of setup() method

    public void addVehicle() {
        System.out.println("Please Enter Vehicle Details...");

        input.nextLine(); // Required for bug in Scanner Class
        System.out.print("Enter Make : ");
        String make = input.nextLine();
        System.out.print("Enter Model : ");
        String model = input.nextLine();
        System.out.print("Enter Price : ");
        float price = input.nextFloat();
        System.out.print("Enter Passengers : ");
        int passengers = input.nextInt();
        input.nextLine(); // Extra read for bug in Scanner Class
        System.out.print("Enter Registration : ");
        String reg = input.nextLine();

        boolean isAdded = carStore.add(new Vehicle(make,
                model,
                price,
                passengers,
                reg));
        if (isAdded)
            System.out.println("Product Added Successfully...");
        else
            System.out.println("No Product Added...");

    } // End of addVehicle()

    public void printVehicles() {
        System.out.println();
        System.out.println("///////////////////////");
        System.out.println("////Vehicle Details////");
        System.out.println("///////////////////////");
        System.out.println();
        System.out.println(carStore.getListVehicles());
    } // End of printVehicle()

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void dummyData() {
        Vehicle v1 = new Vehicle("BYD",
                "GTX Pro",
                12345,
                5,
                "A23456");
        carStore.add(v1);

        Vehicle v2 = new Vehicle("VW",
                "ID.4",
                23456,
                4,
                "B13458");
        carStore.add(v2);

    }
} // End of Driver Class
