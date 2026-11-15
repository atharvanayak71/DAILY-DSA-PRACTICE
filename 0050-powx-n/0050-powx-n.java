class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        boolean negative = exp < 0;

        if (negative) {
            exp = -exp;
        }

        double ans = power(x, exp, 1);

        return negative ? 1.0 / ans : ans;
        }
    double power(double x, long n, double ans){
        if(n == 0){
            return ans;
        }
        if(n%2 != 0){
            ans *= x;
        }
        return power(x*x, n/2, ans);
    }
}