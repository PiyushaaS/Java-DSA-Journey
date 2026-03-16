class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums={-2, -3, -7, -2, -10, -4};
        Solution obj= new Solution();
        System.out.print(obj.maxSubArray(nums));
    }
}