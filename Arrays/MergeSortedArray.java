import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                temp[k]=nums1[i];
                i++;
            }
            else if(nums2[j]<=nums1[i]){
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        for(int p=0;p<temp.length;p++){
            nums1[p]=temp[p];
        }
    }
    public static void main(String[] args){
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        Solution obj= new Solution();
        obj.merge(nums1,3,nums2,3);
        System.out.print(Arrays.toString(nums1));
    }
}