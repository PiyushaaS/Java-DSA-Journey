class Solution{
    public int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        System.out.println(obj.Sum(4));
    }
}
