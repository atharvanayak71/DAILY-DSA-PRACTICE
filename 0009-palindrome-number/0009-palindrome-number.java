class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        return x == reverse(x,0);
        
    }
    public int reverse(int x, int rev){
        if(x == 0){
            return rev;
        }
        
        int rem = x % 10;
        rev = (rev * 10) + rem;

        return reverse(x/10, rev); 
    }
}