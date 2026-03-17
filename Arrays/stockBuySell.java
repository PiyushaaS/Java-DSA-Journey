class Solution {
    public int stockBuySell(int[] arr, int n) {
        int profit=0;
        int Min=arr[0];
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            profit=arr[i]-Min;
            Max=Math.max(Max,profit);
            Min=Math.min(Min,arr[i]);
        }
        return Max;
    }
    public static void main(String[] args){
        int[] arr={7,6,4,3,1};
        Solution obj= new  Solution();
        System.out.print(obj.stockBuySell(arr,5));
    }
}