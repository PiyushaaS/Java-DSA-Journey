class Solution {
    public int singleNumber(int[] nums){
        int XOR=0;
        for(int num:nums){
            XOR=XOR^num;
        }
        return XOR;
    }
    public static void main(String[] args){
        int[] nums={1, 2, 2, 4, 3, 1, 4};
        Solution obj = new Solution();
        System.out.print(obj.singleNumber(nums));
    }
}