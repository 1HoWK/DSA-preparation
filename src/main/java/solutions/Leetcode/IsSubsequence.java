// LeetCode 392. Is Subsequence

public class isSubsequence{
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int sPointer = 0;
        int tPointer = 0;

        // make sure it iterate until the end
        while (tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                if (sPointer == s.length()) { // reach the end of s means we have found every characters
                    return true;
                }
            }
            tPointer++;
        }
        return false;

    }
}