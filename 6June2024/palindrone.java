public class palindrone {
    public static void main(String[] args) {
        String str = "racecar";
        //char original[] = str.toCharArray();
        char chars[] = str.toCharArray();
        char temp[] =  new char[str.length()];
        int j=str.length()-1;
        for(int i=0; i<str.length()/2; i++){
            temp[i]=str.charAt(i);
            chars[i]=chars[j];
            chars[j]=temp[i];
            j--;
        }
        String reversed = new String(chars);
        if(reversed.equals(str)){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Not a palindrone");
        }
    }
}
