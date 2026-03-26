/**

        *

        * MAIN CLASS - UseCase3TrainConsistMgmnt
*

        * Use Case 3: Track Unique Bogie IDs

* Description:
        * This class ensures that duplicate bogie IDs are not
* added into the train formation using HashSet.
*

        * At this stage, the application:
        * - Stores bogie IDs
* - Prevents duplicates automatically
* - Displays unique bogie identifiers
*

        * This maps uniqueness validation using Set.
        *

@author Developer
* @version 3.0
        */

import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        //Welcome banner
        System.out.println("===========================================");
        System.out.println("=== UC3 - Track Unique Bogie IDs ===");
        System.out.println("===========================================");

        //create
        Set<String> Bogies = new HashSet<>();

        //adding
        Bogies.add("BG101");
        Bogies.add("BG102");
        Bogies.add("BG103");
        Bogies.add("BG104");

        //duplicates will be ignored
        Bogies.add("BG101");
        Bogies.add("BG102");


        System.out.println("Bogie IDs After Insertion:\n"+Bogies);

        System.out.println("Note:\nDuplicates are automatically ignored by HashSet");

        System.out.println("\nUC3 uniqueness validation completed.");
    }
}
