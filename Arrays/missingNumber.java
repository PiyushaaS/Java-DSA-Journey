class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sum_2 = 0;
        for(int i= 0;i<n;i++){
            sum_2+=nums[i];
        }
        return sum-sum_2;
    }
    public static void main(String[] args){
        int[] nums={0, 2, 3, 1, 4};
        Solution obj = new Solution();
        System.out.print(obj.missingNumber(nums));
    }
}