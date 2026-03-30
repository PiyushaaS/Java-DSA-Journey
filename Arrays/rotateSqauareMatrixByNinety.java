import java.util.Arrays;
class Solution{
    public int[][] rotateArr(int[][] nums){
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               int temp=nums[i][j];
               nums[i][j]=nums[j][i];
               nums[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=nums[i][left];
                nums[i][left]=nums[i][right];
                nums[i][right]=temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        Solution obj= new Solution();
        System.out.print(Arrays.deepToString(obj.rotateArr(nums)));
    }
}
