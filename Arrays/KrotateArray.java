import java.util.Arrays;
class Solution{
    public void rotateArray(int[] arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7};
        Solution obj= new Solution();
        obj.rotateArray(arr,3);
        System.out.print(Arrays.toString(arr));
    }
}