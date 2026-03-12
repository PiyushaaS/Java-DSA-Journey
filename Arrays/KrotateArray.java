import java.util.Arrays;
class Solution{
    public void RotateArray(int[] arr,int k){
        k=k%arr.length;
        int[] temp= new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        for(int i= 0;i<k;i++){
            arr[arr.length-k+i]=temp[i];
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        Solution obj= new Solution();
        obj.RotateArray(arr,3);
        System.out.print(Arrays.toString(arr));
    }
}