import java.util.Arrays;
class QuickSort{
    public void Sort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex= Partition(arr,low,high);
            Sort(arr,low,pivotIndex-1);
            Sort(arr,pivotIndex+1,high);
        }
    }
    public int Partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args){
        int[] arr={3,1,6,2,7};
        QuickSort obj= new QuickSort();
        obj.Sort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}