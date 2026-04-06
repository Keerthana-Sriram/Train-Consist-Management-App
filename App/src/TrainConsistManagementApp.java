
import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        //Welcome banner
        System.out.println("=============================================");
        System.out.println("=== UC6 - Map Bpgie to Capacity (HashMap) ===");
        System.out.println("=============================================");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper",24);
        bogieCapacity.put("AC Chair",120);
        bogieCapacity.put("First Class",72);
        bogieCapacity.put("Cargo",56);

        System.out.println("The set is: ");
        for(String key : bogieCapacity.keySet()){
            System.out.println(key+"->"+bogieCapacity.get(key));
        }

        System.out.println("\nUC6 operations completed successfully.");
    }
}

