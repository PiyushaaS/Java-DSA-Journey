class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.isEmpty()){
            return 0;
        }
        int longest=0;
        for(int key:set){
            int count=1;
            if(!set.contains(key-1)){
                int curNum=key;
                while(set.contains(curNum+1)){
                    curNum++;
                    count++;
                }
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}