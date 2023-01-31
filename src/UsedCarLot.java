import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car newCar) {
        inventory.add(newCar);
    }

    public boolean swap(int index, int index2) {
        if (index < 0 || index2 < 0 || index > inventory.size()-1 || index2 > inventory.size()-1) {
            return false;
        }

        Car replaced = inventory.set(index, inventory.get(index2));
        inventory.set(index2, replaced);

        return true;
    }
}

