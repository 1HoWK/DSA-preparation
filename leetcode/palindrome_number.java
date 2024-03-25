class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        int original = x;
        int lastDigit = 0;
        int reversed = 0;
        
        while(x>0){
            lastDigit = x % 10;
            reversed = (reversed*10) + lastDigit;
            x=x/10;
        }
        return reversed == original;
    }
}
