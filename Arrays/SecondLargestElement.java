class Solution{
    public int SecondLargestElement(int[] arr,int n){
        int largest=arr[0];
        int Slargest= -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>Slargest){
                Slargest=arr[i];
            }
        }
        return Slargest;
    }
        public static void main(String[] args){
            int[] arr= {1,3,2,5,7};
            Solution obj= new Solution();
            System.out.print(obj.SecondLargestElement(arr, arr.length));
        }
}