import java.util.*;

class PassengerBogie {
    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Step 1: Create list of passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));

        // 🔹 Step 2: Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(PassengerBogie::getCapacity));

        // 🔹 Step 3: Display sorted bogies
        System.out.println("🚆 Bogies sorted by capacity (Ascending):");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}