import java.util.*;
class Solution{
    public void Freq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.print(map);
    }
    public static void main(String[] args){
        int[] arr={1,2,2,1,3};
        Solution obj= new Solution();
        obj.Freq(arr);
    }
}