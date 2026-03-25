import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.isEmpty()){
            return 0;
        }
        int longest=0;
        int cnt=0;
        for(int key:set){
            if(!set.contains(key-1)){
                int curNum=key;
                cnt=1;
                while(set.contains(curNum+1)){
                    curNum++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args){
        int[] nums={100, 4, 200, 1, 3, 2};
        Solution obj= new Solution();
        System.out.print(obj.longestConsecutive(nums));
    }
}