class Solution {
    public boolean isPalindrome(int n) {
        int rev=0;
        int dup=n;
        while(n>0){
            int lastd= n%10;
            n=n/10;
            rev=(rev*10)+lastd;;
        }
        return rev==dup;
    }
}