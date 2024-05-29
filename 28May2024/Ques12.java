import java.util.ArrayList;
import java.util.Scanner;

public class Ques12 {

    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Menu loop to interact with the ArrayList
        int choice;
        do {
            System.out.println("\nArrayList Practice Menu:");
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Print all names");
            System.out.println("4. Search for a name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String nameToAdd = scanner.next();
                    names.add(nameToAdd);
                    System.out.println(nameToAdd + " added successfully!");
                    break;
                case 2:
                    System.out.print("Enter a name to remove: ");
                    String nameToRemove = scanner.next();
                    if (names.remove(nameToRemove)) {
                        System.out.println(nameToRemove + " removed successfully!");
                    } else {
                        System.out.println(nameToRemove + " not found in the list.");
                    }
                    break;
                case 3:
                    if (names.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Names in the list:");
                        for (int i=0;i<names.size();i++) {
                            System.out.println(names.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter a name to search: ");
                    String nameToSearch = scanner.next();
                    if (names.contains(nameToSearch)) {
                        System.out.println(nameToSearch + " found in the list.");
                    } else {
                        System.out.println(nameToSearch + " not found in the list.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close(); // Close the scanner to avoid resource leak
    }
}