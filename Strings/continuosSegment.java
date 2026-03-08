class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        String s="110";
        System.out.print(obj.checkOnesSegment(s));
    }
}
