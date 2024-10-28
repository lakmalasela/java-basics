import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopWithList {

    public static void main(String[] args) {
        // List of strings
        List<String> names = new ArrayList<>();
        names.add("Amal");
        names.add("Kamal");
        names.add("Vishwa");

        // Using enhanced for loop to iterate over the list
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }

}
