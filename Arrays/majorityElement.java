class Solution{
    public int majorityElement(int[] nums){
        int cnt=0;
        int ele=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int con=0;
        int major=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele){
                con++;
            }
            if(con>n/2){
                major=ele;
            }
        }
        return ele;
    }
    public static void main(String[] args){
        int[] nums={-1, -1, -1, -1};
        Solution obj= new Solution();
        System.out.print(obj.majorityElement(nums));
    }
}