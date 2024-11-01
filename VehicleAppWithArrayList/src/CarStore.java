import java.util.ArrayList;

public class CarStore
{
   // private Vehicle[] vehicles;
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    private boolean isEmpty() {
        return vehicles.isEmpty();
    }

    public boolean add(Vehicle vehicle) {
        return vehicles.add(vehicle);
    }

    public String getListVehicles() {
        if (isEmpty()) {
            return "No Vehicles in the CarStore";
        } else {
            String listOfVehicles = "";
            for (int i = 0; i < vehicles.size(); i++) {
                listOfVehicles += i + ": " + vehicles.get(i) + "\n";
            }
            return listOfVehicles;
        }
    }

    public Vehicle getMostExpensiveVehicle() {
        if (!isEmpty()) {
            Vehicle mostExpensiveVehicle = vehicles.get(0);
            for (int i = 1; i < vehicles.size(); i++) {
                if (vehicles.get(i).getPrice() > mostExpensiveVehicle.getPrice())
                    mostExpensiveVehicle = vehicles.get(i);
            }
            return mostExpensiveVehicle;
        } else {
            return null;
        }
    }
    ////////////////////////////////////////////////

    public Vehicle find(String reg) {
        Vehicle foundVehicle = null;

        if(!isEmpty()) {
            for(Vehicle v : vehicles)
                if(v.getRegistration().equals(reg))
                    foundVehicle = v;
        }

       return foundVehicle;
    }

    public boolean updatePrice(float newPrice, String reg) {

        if (!isEmpty()) {
            Vehicle v = find(reg);
                if(v!= null) {
                    v.setPrice(newPrice);
                    return true;
                }
        }
        return false;
    }
}
