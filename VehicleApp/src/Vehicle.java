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
        setModel(model);
        setMake(make);
        setNumWheels(numWheels);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {

        if(passengers >= 2 && passengers <= 20)
            this.passengers = passengers;
        else
            System.out.println("Unable to Set Passengers");
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        if(price >= 5000 && price <= 100000)
            this.price = price;
        else
            System.out.println("Unable to Set Price");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
       if(model != null)
           if(model.length() > 0)
                this.model = model;
       else
           System.out.println("Unable to Set Model");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make != null)
            if(make.length() > 0)
                this.make = make;
        else
            System.out.println("Unable to Set Make");
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {

        if(numWheels >=2 && numWheels <= 8)
            this.numWheels = numWheels;
        else
            System.out.println("Unable to Set Num Wheels");
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
