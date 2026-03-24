import java.util.*;
class Solution{
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        int n= nums.length;
        int max=nums[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                list.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        int[] nums={-3, 4, 5, 1, -4, -5 };
        Solution obj= new Solution();
        System.out.print(obj.leaders(nums));
    }
}