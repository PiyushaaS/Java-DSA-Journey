class Solution{
    public void LargestElement(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        int[] arr={1,4,2,6,5};
        obj.LargestElement(arr);
    }
}