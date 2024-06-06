import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// import javax.xml.stream.events.Characters;

public class StringOrderAll {
    public static void main(String[] args) {
        String str = "MyName2811ROnak";
        ArrayList<Character> sortedVowels= new ArrayList<>(sortVowels(str)); 
        // System.out.println("String with sorted vowels: " + sortedVowels);

        ArrayList<Character> UpperCase = new ArrayList<>();
        ArrayList<Character> LowerCase = new ArrayList<>();
        ArrayList<Character> Numeric = new ArrayList<>();

    
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u' ||str.charAt(i) != 'A' || str.charAt(i) != 'E' || str.charAt(i) != 'I' || str.charAt(i) != 'O' || str.charAt(i) != 'U'){
                if(str.charAt(i)>=65 && str.charAt(i)<=90){
                    UpperCase.add(str.charAt(i));
                }
                else if(str.charAt(i)>=97 && str.charAt(i)<=122){
                    LowerCase.add(str.charAt(i));
                }
                else if(str.charAt(i)>='1' && str.charAt(i)<='9'){
                    Numeric.add(str.charAt(i));
                }
                // else if(Character.isDigit(c)){
                //     Numeric.add(c);
                // }
            }    
        }
        ArrayList<Character> combinedList = new ArrayList<>();
        combinedList.addAll(sortedVowels);
        combinedList.addAll(UpperCase);
        combinedList.addAll(LowerCase);
        combinedList.addAll(Numeric);
        
        String result = combinedList.toString();

        System.out.println("Sorted String: " + result);

    }
    public static List<Character> sortVowels(String str) {
        ArrayList<Character> vowels = new ArrayList<>();

        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        
        // String Vowel = vowels.toString();
        return vowels;

     }
}
