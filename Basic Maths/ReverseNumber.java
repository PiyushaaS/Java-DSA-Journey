class Solution {
    public int reverseNumber(int n) {
        int rev=0;
        while(n>0){
        int LastDigit= n%10;
        n=n/10;
        rev=(rev*10)+LastDigit;
        }
        return rev;
    }
}