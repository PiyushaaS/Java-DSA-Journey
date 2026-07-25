class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> row= new ArrayList<>();
            int first=1;
            row.add(first);
            for(int j=1;j<i;j++){
                first*=i-j;
                first/=j;
                row.add(first);
            }
            ans.add(row);
        }
        return ans;
    }
}