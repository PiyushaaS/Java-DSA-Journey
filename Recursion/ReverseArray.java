class Solution{
    public void RevArr(int i,int n,int[] arr){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        RevArr(i+1,n,arr);
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6};
        int size=arr.length;
        Solution obj= new Solution();
        obj.RevArr(0,size,arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}