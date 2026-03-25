import java.util.*;
class Solution{
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int left=0;
        int longest=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            longest=Math.max(longest,right-left+1);
        }
        return longest;
    }
    public static void main(String[] args){
        String s="pwwkew";
        Solution obj= new Solution();
        System.out.print(obj.lengthOfLongestSubstring(s));
    }
}