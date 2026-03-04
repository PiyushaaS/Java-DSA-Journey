import java.util.Arrays;
class Solution {
    public int[] divisors(int n) {
       ArrayList<Integer> al= new ArrayList<>();
       for(int i=1;i*i<=n;i++){
        if(n%i==0){
            al.add(i);
            if(n/i !=i){
                al.add(n/i);
            }
        }
       }
       Collections.sort(al);
       int[] result = new int[al.size()];
       for(int i=0;i<al.size();i++){
        result[i]= al.get(i);
       }
       return result;
    }
}