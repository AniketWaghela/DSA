class Solution {
    public int countSubarrays(int[] nums) {
        
        int ans=0;
        for(int i=2;i< nums.length ;i++){
            int temp = nums[i] + nums[i-2];
            if( nums[i-1] == temp*2) ans++;
        }

        return ans;
    }
}