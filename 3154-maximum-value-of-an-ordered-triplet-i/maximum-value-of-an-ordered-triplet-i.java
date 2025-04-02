class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long temp = ((long)nums[i]-(long)nums[j])*(long)nums[k];
                    if(temp > 0) ans = Math.max(temp,ans);
                }
            }
        }

        return ans;        
    }
}