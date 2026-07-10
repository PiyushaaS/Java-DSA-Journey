class Solution {
    public int maxProfit(int[] prices) {
        int Min=Integer.MAX_VALUE;
        int Max=0;
        for(int i=0;i<prices.length;i++){
            Min=Math.min(Min,prices[i]);
            Max=Math.max(Max,prices[i]-Min);
        }
        return Max;
    }
}