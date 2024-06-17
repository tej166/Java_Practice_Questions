
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumber {
    public static void main(String[] args) {
        int[] numbers = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int num : numbers) {
            if (num < 0) {
                negative.add(num);
            } else {
                positive.add(num);
            }
        }
        
        // Sort positive and negative lists
        Collections.sort(positive);
        Collections.sort(negative);
        
        // Merge positive and negative lists
        List<Integer> sortedNumbers = new ArrayList<>();    
    }
}