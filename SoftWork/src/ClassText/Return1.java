package ClassText;

public class Return1 {
    public static void main(String[] args) {
        String s = "abaccad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        char[] ch = s.toCharArray();
        int maxlen = 1;
        int begin = 0;
        if (len < 2) {
            return s;
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j-i+1>maxlen &&validPalindromic(ch,i,j)){
                    maxlen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxlen);
    }

    private static boolean validPalindromic(char[] charArray, int left, int right) {
        while (left<right){
            if (charArray[left]!=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}