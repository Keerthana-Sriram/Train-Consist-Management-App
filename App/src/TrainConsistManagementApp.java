/* MAIN CLASS - UseCase2TrainConsistMgmnt

* Use Case 2: Add Passenger Bogies to Train

* Description:
        * This class demonstrates how passenger bogies can be
* managed dynamically using ArrayList operations.
*
        * At this stage, the application:
        * - Adds new bogies to the train
* - Removes existing bogies
* - Checks for bogie availability
* - Displays the final consist

* This maps CRUD operations using ArrayList.
        *

        * @author DeveLoper
* @version 2.0 */

import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        //Welcome banner
        System.out.println("===========================================");
        System.out.println("=== UC2 - Add Passemger Bogies to Train ===");
        System.out.println("===========================================");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding Bogies:\nPassenger Bogies: "+passengerBogies+"\n");

        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair': "+passengerBogies+"\n");

        System.out.println("Checking if 'Sleeper Exists: \nContains Sleeper? : "+passengerBogies.contains("Sleeper"));

        System.out.println("Final Train Passenger Consists: "+passengerBogies+"\n");

        System.out.println("\nUC2 operations completed successfully.");
    }
}
