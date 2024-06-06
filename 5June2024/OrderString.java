public class OrderString{
    public static void main(String[] args){
        String str = "Tejal16Mahur";
        int j = 0;
        char[] chars = str.toCharArray();
        char[] temp = new char[chars.length]; 
        for(int i=0; i<chars.length; i++){
            // char c = str.charAt(i);
            // if(c[i]>='a' && c<='z' || c>='A' && c <='Z'){}
            if(chars[i]>='a'&& chars[i]<='z'){
                temp[j] = chars[i];
                j++;
            }
        }
        for(int i=0; i<chars.length; i++){
            if(chars[i]>='A' && chars[i]<='Z'){
                temp[j] = chars[i];
                j++;
            }
        }
        for(int i=0; i<chars.length; i++){
            if(chars[i]>='1' && chars[i]<='9'){
                temp[j] = chars[i];
                j++;
            }
        }
        String ordered = new String(temp);
        System.out.println("Ordered String: " + ordered);

    }
}