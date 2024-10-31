public class CarStore
{
    private Vehicle[] vehicles;
    private int currentVehicles = 0;

    public CarStore(int numberVehicles) {
        vehicles = new Vehicle[numberVehicles];
    }

    private boolean isFull() {
        return currentVehicles == vehicles.length;
    }

    private boolean isEmpty() {
        return currentVehicles == 0;
    }

    public boolean add(Vehicle vehicle) {
        if (isFull()) {
            return false;
        } else {
            vehicles[currentVehicles] = vehicle;
            currentVehicles++;
            return true;
        }
    }

    public String getListVehicles() {
        if (isEmpty()) {
            return "No Vehicles in the CarStore";
        } else {
            String listOfVehicles = "";
            for (int i = 0; i < currentVehicles; i++) {
                listOfVehicles += i + ": " + vehicles[i] + "\n";
            }
            return listOfVehicles;
        }
    }

    public Vehicle getMostExpensiveVehicle() {
        if (!isEmpty()) {
            Vehicle mostExpensiveVehicle = vehicles[0];
            for (int i = 1; i < currentVehicles; i++) {
                if (vehicles[i].getPrice() > mostExpensiveVehicle.getPrice())
                    mostExpensiveVehicle = vehicles[i];
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
            for(int i = 0; i < currentVehicles; i++)
                if(vehicles[i]
                        .getRegistration()
                        .equals(reg))
                    foundVehicle = vehicles[i];
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
