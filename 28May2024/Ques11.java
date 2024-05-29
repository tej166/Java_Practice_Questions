import java.util.ArrayList;
import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        // input.close();
        while(true){
            display();
            int choice = input.nextInt();

            if(choice == 1){
                System.out.print("Enter the number to insert: ");
                integer.add(input.nextInt());
                System.out.println("ADDED \n");
            }
            if(choice == 2){
                System.out.println("Enter Integer to remove: ");
                Integer elementToRemove =  input.nextInt();
                if(integer.contains(elementToRemove)){
                    integer.remove(elementToRemove);
                    System.out.println("REMOVED \n");
                }
                else{
                    System.out.println("Not There");
                }
            }
            if(choice == 3){
                System.out.println("Your List: " + integer);
            }
            if(choice ==4){
                System.out.println("Good Bye!!!!!");
                break;
            }
        }
        input.close();
    }

    private static void display(){
        System.out.println("1. ADD");
        System.out.println("2. REMOVE");
        System.out.println("3. DISPLAY");
        System.out.println("4. EXIT \n");
        System.out.print("Enter your option: ");
        System.out.print("\n");

    }
    
}
