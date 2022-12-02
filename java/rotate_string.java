class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() == goal.length() && (s.concat(s).contains(goal))) {
            return true;
        } else {
            return false;
        }
    }
}