import java.util.*;
class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums={3,2,4};
        Solution obj= new Solution();
        System.out.print(Arrays.toString(obj.twoSum(nums,6)));
    }
}