/* MAIN CLASS - UseCase4TrainConsistMgmnt

*

        * Use Case 4: Maintain Ordered Bogie Consist

* Description:
        * This class models the physical chaining of train bogies
* using LinkedList for ordered operations.

        * At this stage, the application:
        * - Adds bogies in sequence
* - Inserts bogies at specific positions
* - Removes bogies from front and rear
* - Displays updated train structure

* This maps positional operations using LinkedList.

        * @author Developer
* @version 4.0
        */

import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        //Welcome banner
        System.out.println("========================================");
        System.out.println("=== UC4 - Maintain Ordered Bogie IDs ===");
        System.out.println("========================================");

        //create linked list
        List<String> trainConsist = new LinkedList<>();

        //adding initial bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consists:\n"+trainConsist+"\n");

        //duplicates will be ignored
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("After Removing First and Last Bogie:\n"+trainConsist+"\n");

        System.out.println("UC4 ordered consist operations completed.");
    }
}
