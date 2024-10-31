public class Vehicle {

 private String model = "ACME Model";
 private String make = "ACME Make";
 private float price = 10000;
 private int passengers = 4;
 private String registration = "A12345";

    public Vehicle(String make, String model, float price,
                   int passengers, String registration) {
        setPassengers(passengers);
        setPrice(price);
        setMake(make);
        setModel(model);
        setRegistration(registration);
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

    public void setRegistration(String reg) {
        if(!registration.isEmpty())
            this.registration = reg;
        else
            System.out.println("Unable to set Registration, " +
                    "Must not be Empty");
    }

    public String toString() {

        return
                "Make : " + make + "," +
                "Model : " + model + "," +
                "Price : " + price + "," +
                "Passengers : " + passengers + "," +
                "Registration : " + registration;
    } // End of toString()

    public String getRegistration() {
        return registration;
    }
} // End of Class Vehicle
