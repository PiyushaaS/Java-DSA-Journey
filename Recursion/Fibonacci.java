class Solution{
    public int Fibo(int n){
        if(n<=1){
            return n;
        }
        int last=Fibo(n-1);
        int Slast= Fibo(n-2);
        return last+Slast;
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        System.out.println(obj.Fibo(4));
    }
}