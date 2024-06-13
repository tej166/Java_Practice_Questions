public class reverseString {
    public static void main(String[] args) {
        String str = "Tejal";
        char temp[] = new char[str.length()];
        char[] chars = str.toCharArray();
        int j = chars.length-1;
        for(int i=0; i<chars.length/2; i++){
            temp[i]=chars[i];
            chars[i]=chars[j];
            chars[j]=temp[i];
            j--;
        }
        String reversed = String.valueOf(chars);
        System.out.println("reversed Array: " + reversed);
    }
}
