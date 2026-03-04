class Solution {
    public boolean isArmstrong(int n) {
        int sum=0;
        int dup=n;
        while(n>0){
        int i= n%10;
        n=n/10;
        sum=(sum)+(i*i*i);
        }
        return sum==dup;
    }
}