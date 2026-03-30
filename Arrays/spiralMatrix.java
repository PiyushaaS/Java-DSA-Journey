import java.util.*;
class Solution{
    public List<Integer> spiralArray(int[][] nums){
        ArrayList<Integer> list= new ArrayList<>();
        int left=0;
        int right=nums[0].length-1;
        int bottom=nums.length-1;
        int top=0;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                list.add(nums[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(nums[i][right]);
                }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    list.add(nums[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(nums[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        Solution obj= new Solution();
        System.out.print(obj.spiralArray(nums));
    }
}
