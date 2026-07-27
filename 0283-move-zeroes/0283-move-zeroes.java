class Solution {
    public void moveZeroes(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                index=i;
                break;
            }
        }
        if(index==-1){
            return;
        }
        for(int j=index+1;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
    }
}
