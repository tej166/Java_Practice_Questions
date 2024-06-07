import java.util.HashMap;

public class StringCompressionHash {
    public int compress(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        if(chars.length == 1) {
            return chars.length;
        }
        for(char c : chars) {
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
            else {
                int count = map.get(c); 
                map.put(c, count+1); 
            }
        }
        String output = "";
        for(char c: map.keySet()) {
            int temp = map.get(c);
            if(temp == 1) {
                output+= c;
            }
            else {
               output += c+""+map.get(c); 
            }  
        }
        chars = output.toCharArray();
     
        return chars.length;
    }
}