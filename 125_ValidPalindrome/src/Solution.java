public class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        for (int i = 0 ; i < j; i++, j--) {
            while(i < j && !Character.isAlphabetic(s.charAt(i))  && !Character.isDigit(s.charAt(i))) {
                i++;
            }
            while (j > i && !Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))) {
                j--;
            }
            if (i >= j) {
                break;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
