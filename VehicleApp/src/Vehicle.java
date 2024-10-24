public class Vehicle {

 private String model = "ACME Model";
 private String make = "ACME Make";
 private float price = 10000;
 private int passengers = 2;
 private int numWheels = 2;

//  public Vehicle() {
//      this.passengers = 5;
//      this.price = 10000;
//      this.model = "ACME Model";
//      this.make = "ACME Make";
//      this.numWheels = 5;
//  } // End of Default Constructor

    public Vehicle(String make, String model, float price,
                   int passengers, int numWheels) {
        setPassengers(passengers);
        setPrice(price);
        setMake(make);
        setModel(model);
        setNumWheels(numWheels);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if(passengers >= 2 && passengers <= 20)
                this.passengers = passengers;
        else
            System.out.println("Unable to set Passengers, " +
                    "Must be between 2 and 20");
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price >= 5000 && price <= 100000)
            this.price = price;
        else
            System.out.println("Unable to set Price, " +
                    "Must be between 5000 and 100000");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.isEmpty())
            this.model = model;
        else
            System.out.println("Unable to set Model, " +
                    "Must not be Empty");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(!make.isEmpty())
            this.make = make;
        else
            System.out.println("Unable to set Make, " +
                    "Must not be Empty");
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        if(numWheels >= 2 && numWheels <= 8)
            this.numWheels = numWheels;
        else
            System.out.println("Unable to set Wheels, " +
                    "Must be between 5000 and 100000");
    }

    public String toString() {

        return
                "Make : " + make + "," +
                "Model : " + model + "," +
                "Price : " + price + "," +
                "Passengers : " + passengers + "," +
                "Wheels : " + numWheels;
    } // End of toString()

} // End of Class Vehicle
