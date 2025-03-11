public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (Character.isLetterOrDigit(x)) {
                sb.append(x);
            }
        }
        int l = 0;
        int r = sb.length() - 1;

        while (l < r) {
            if (Character.toLowerCase(sb.charAt(l)) != Character.toLowerCase(sb.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
