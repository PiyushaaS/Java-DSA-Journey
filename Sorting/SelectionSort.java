class Solution{
    public int[] SelectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={3,1,5,2,6};
        Solution obj= new Solution();
        System.out.print(obj.SelectionSort(arr));
    }
}