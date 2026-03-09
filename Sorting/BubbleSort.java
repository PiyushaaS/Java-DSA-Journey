import java.util.Arrays;

class Solution {
    public void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 6 };
        Solution obj = new Solution();
        obj.BubbleSort(arr);
    }
}