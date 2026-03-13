import java.util.Arrays;
class Solution{
    public void moveZeroToEnd(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,0,3,0,0,4};
        Solution obj= new Solution();
        obj.moveZeroToEnd(arr);
        System.out.print(Arrays.toString(arr));
    }
}
