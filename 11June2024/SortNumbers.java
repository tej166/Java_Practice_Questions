
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumbers {
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
        int i = 0, j = 0;
        while (i < positive.size() && j < negative.size()) {
            sortedNumbers.add(negative.get(j++));
            sortedNumbers.add(positive.get(i++));
        }
        
        // Add remaining positive or negative numbers
        while (i < positive.size()) {
            sortedNumbers.add(positive.get(i++));
        }
        
        while (j < negative.size()) {
            sortedNumbers.add(negative.get(j++));
        }
        
        // Output the sorted array
        for (int number : sortedNumbers) {
            System.out.print(number + " ");
        }
    }
}