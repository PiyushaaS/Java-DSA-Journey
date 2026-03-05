class Solution {
    public void printNumbers(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        obj.printNumbers(5);
    }
}