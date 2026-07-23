class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
       for(int i=0;i<row;i++){
           for(int j=i+1;j<row;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
       }
       reverse(matrix);
    }
    public static void reverse(int[][] nums){
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=nums[0].length-1;
            while(left<right){
                int temp=nums[i][left];
                nums[i][left]=nums[i][right];
                nums[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}