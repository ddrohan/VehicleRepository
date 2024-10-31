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
}
