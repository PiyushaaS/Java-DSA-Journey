import java.util.*;
class Solution{
    public void RotateArray(int[] arr,int k){
        k=k%arr.length;
        ArrayList<Integer> temp= new ArrayList<>();
        for(int i=0;i<k;i++){
            temp.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        for(int i= 0;i<temp.size();i++){
            arr[arr.length-k+i]=temp.get(i);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        Solution obj= new Solution();
        obj.RotateArray(arr,3);
        System.out.print(Arrays.toString(arr));
    }
}