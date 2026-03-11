import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
      public static void main(String[] args){
        int[] arr={1,1,4,5,5,6};
        Solution obj= new Solution();
        System.out.println(obj.removeDuplicates(arr));
        System.out.print(Arrays.toString(arr));
    }
}