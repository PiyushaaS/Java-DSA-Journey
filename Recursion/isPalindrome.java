class Solution{
    public boolean isPalindrome(char[] arr, int i, int n){
        if(i>=n/2){
            return true;
        }
        if(arr[i]!=(arr[n-i-1])){
            return false;
        }
        return isPalindrome(arr,i+1,n);
    }
    public static void main(String[] args){
        String str="MADAM";
        char[] arr= str.toCharArray();
        int n= arr.length;
        Solution obj= new Solution();
        System.out.print(obj.isPalindrome(arr,0,n));
    }
}