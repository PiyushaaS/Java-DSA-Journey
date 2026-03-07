import java.util.*;
class Solution{
    public void Freq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfreq=0;
        int element=-1;
        for(int key:map.keySet()){
            if(map.get(key)>maxfreq){
                maxfreq = map.get(key);
                element = key;
            }
        }
        System.out.print("The highest occuring element is "+element+" which appears "+maxfreq+" times." );
    }
    public static void main(String[] args){
        int[] arr={1,2,2,1,2};
        Solution obj= new Solution();
        obj.Freq(arr);
    }
}
