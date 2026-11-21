class Solution {
    public int minRange(int a, int b, int c) {
        int originalA = a;
        int originalB = b;
        int originalC = c;
        
        int maxNum1 = Math.max(originalA, Math.max(originalB, originalC));
        int minNum1 =  Math.min(originalA, Math.min(originalB, originalC));

        int minRange1 = maxNum1 - minNum1;
        

        int maxNum2 = (a + b + c) - maxNum1;
        int minRange2 = maxNum2 - minNum1;

        return Math.min(minRange1, minRange2);
    }
}