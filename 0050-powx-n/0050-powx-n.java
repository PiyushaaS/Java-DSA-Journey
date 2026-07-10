class Solution {
    public double myPow(double x, int n) {
        long power =n;
        if(power<0){
            x=1/x;
            power=-power;
        }
        return pow(x,n);
    }
    public double pow(double x,long n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow(x*x,n/2);
        }
        return x*pow(x*x,n/2);
    }
}