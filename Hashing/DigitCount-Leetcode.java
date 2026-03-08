class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // freq count
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        // check condition
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            int freq = map.getOrDefault(i, 0);
            if (freq != expected) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1210";
        Solution obj = new Solution();
        System.out.print(obj.digitCount(str));
    }
}