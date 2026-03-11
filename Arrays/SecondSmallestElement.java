class Solution {
    public int SmallestElement(int[] arr) {
        int smallest = arr[0];
        int Ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                Ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < Ssmallest) {
                Ssmallest = arr[i];
            }
        }
        return Ssmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 0, 0 };
        Solution obj = new Solution();
        System.out.print(obj.SmallestElement(arr));
    }
}