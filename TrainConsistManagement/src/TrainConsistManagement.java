import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("====================================");
        System.out.println("   Train Consist Management App");
        System.out.println("====================================");

        // Initialize empty consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initialization status
        System.out.println("\nTrain initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
