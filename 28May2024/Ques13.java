import java.util.ArrayList;

public class Ques13 {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        // Create a new ArrayList to store the merged elements
        ArrayList<Integer> mergedList = new ArrayList<>();

        // Option 1: UsingaddAll() method
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Option 2: Using a loop
        /*
        for (int num : list1) {
            mergedList.add(num);
        }
        for (int num : list2) {
            mergedList.add(num);
        }
        */

    }
}            