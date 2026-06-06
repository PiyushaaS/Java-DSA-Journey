import java.util.ArrayList;
class Solution{
public boolean ismonotonic(ArrayList<Integer> nums){
    boolean increasing= true;
    boolean decreasing= true;
    for(int i=0;i<nums.size()-1;i++){
        if(nums.get(i)>nums.get(i+1)){
            increasing=false;
        }
        else if(nums.get(i)<nums.get(i+1)){
            decreasing=false;
        }
    }
    return increasing || decreasing;
}
public static void main(String[] args) {
    Solution obj= new Solution();
     ArrayList<Integer> nums= new ArrayList<>();
     nums.add(1);
     nums.add(2);
     nums.add(2);
     nums.add(3);
     boolean ans=obj.ismonotonic(nums);
     System.out.print(ans);
}
}