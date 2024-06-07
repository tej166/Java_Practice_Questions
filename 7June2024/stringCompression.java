import java.util.ArrayList;
import java.util.Arrays;

public class stringCompression {

  public static void main(String[] args) {
    String str = "aabbcccadd";
    ArrayList<Character> temp = new ArrayList<>();
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    int count = 1;

    for (int i = 0; i < chars.length; i++) {
      if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
        count++;
      } else {
        temp.add(chars[i]);
        if (count > 1) {
          temp.add((char) ('0' + count)); // Convert count to char
        }
        count = 1;
      }
    }
    String result =  temp.toString();
    System.out.println("Compressed string: " + result);
  }
}
