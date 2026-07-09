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
        int i=index;
        int j=i+1;
        while(j<nums.length){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
    }
}