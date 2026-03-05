class Solution{
    public int Fact(int n){
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        System.out.println(obj.Fact(3));
    }
}
