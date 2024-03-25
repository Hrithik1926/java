package Practice1;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
// Populate the list with elements

// Using for-each loop
        long startTime = Calendar.getInstance().getTimeInMillis();
        for (int i : list) {
            int a = i;
        }
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For each loop: " + (endTime - startTime) + " ms");

// Using collection.size()
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int j = 0; j < list.size(); j++) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using collection.size(): " + (endTime - startTime) + " ms");

    }
}
