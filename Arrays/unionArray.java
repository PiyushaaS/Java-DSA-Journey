import java.util.*;
class Solution {

    public ArrayList<Integer> unionArray(int[] nums1, int[] nums2){

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] <= nums2[j]){

                if(union.isEmpty() || union.get(union.size()-1) != nums1[i])
                    union.add(nums1[i]);

                i++;
            }
            else{

                if(union.isEmpty() || union.get(union.size()-1) != nums2[j])
                    union.add(nums2[j]);

                j++;
            }
        }

        while(i < nums1.length){
            if(union.get(union.size()-1) != nums1[i])
                union.add(nums1[i]);
            i++;
        }

        while(j < nums2.length){
            if(union.get(union.size()-1) != nums2[j])
                union.add(nums2[j]);
            j++;
        }

        return union;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,7};

        Solution obj = new Solution();

       System.out.print((obj.unionArray(nums1,nums2)));
    }
}