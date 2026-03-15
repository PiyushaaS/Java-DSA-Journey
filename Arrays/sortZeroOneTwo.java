import java.util.Arrays;
class Solution{
    public void sortZeroOneTwo(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] nums={1, 0, 2, 1, 0};
        Solution obj= new Solution();
        obj.sortZeroOneTwo(nums);
        System.out.print(Arrays.toString(nums));
    }
}