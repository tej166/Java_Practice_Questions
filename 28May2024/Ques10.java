//package JAVA_PRACTICE_QUESTIONS.28May2024;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ques10{
    public static void main(String[] args) {
        
        ArrayList<Integer> integer = new ArrayList<>();
        System.out.print("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <  5; i++){
            int temp = sc.nextInt();

            if(!integer.contains(temp))
                integer.add(temp);
        }
        Collections.sort(integer);
        System.out.println(integer);
        sc.close();
    }
}