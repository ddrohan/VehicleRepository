public class Vehicle {

 private String model;
 private String make;
 private float price;
 private int passengers;
 private int numWheels;

  public Vehicle() {
      this.passengers = 5;
      this.price = 10000;
      this.model = "ACME Model";
      this.make = "ACME Make";
      this.numWheels = 5;
  } // End of Default Constructor

    public Vehicle(String make, String model, float price,
                   int passengers, int numWheels) {
        this.passengers = passengers;
        this.price = price;
        this.model = model;
        this.make = make;
        this.numWheels = numWheels;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String toString() {

        return "Vehicle Details" + "\n" +
                "Make : " + make + "," +
                "Model : " + model + "," +
                "Price : " + price + "," +
                "Passengers : " + passengers + "," +
                "Wheels : " + numWheels;
    } // End of toString()

} // End of Class Vehicle
