
class LongestSubstring {

    public static int longestUniqueSubsttr(String str)
    {
        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {

            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)] == true)
                    break;

                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }

            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "abcabba";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);
        System.out.println("length" + len);
    }
}