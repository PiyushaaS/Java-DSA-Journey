import java.util.Arrays;
class MergeSort{
    public void Sort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            Sort(arr,left,mid);
            Sort(arr,mid+1,right);
            Merge(arr, left, mid, right);
        }
    }
    public void Merge(int[] arr,int left,int mid,int right){
        int[] temp= new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int p=0;p<temp.length;p++){
            arr[left+p]=temp[p];
        }
    }
    public static void main(String[] args) {
        int[] arr= {8,3,5,2};
        MergeSort obj= new MergeSort();
       obj.Sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}