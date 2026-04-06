/**

        * =

        * MAIN CLASS - UseCase5TrainConsistMgmnt
*=

        *
        * Use Case 5: Preserve Insertion Order of Bogies
*

        * Description:
        * This class maintains the exact attachment order of bogies
* while also preventing duplicate entries using LinkedHashSet.
        *
        * At this stage, the application:
        * - Attaches bogies in order
* - Preserves insertion sequence
* - Avoids duplicate bogies
* - Displays final train formation
*
        * This maps ordered uniqueness using LinkedHashSet.
        *

        * @author Developer
* @version 5.0
        */



import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        //Welcome banner
        System.out.println("========================================");
        System.out.println("=== UC4 - Maintain Ordered Bogie IDs ===");
        System.out.println("========================================");

        //create linked list
        Set<String> formation = new LinkedHashSet<>();

        //adding initial bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); //duplicates will be ignored

        System.out.println("Final Train Consists:\n"+formation+"\n");
        System.out.println("Note:\nLinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UC5 formation setup completed.");
    }
}