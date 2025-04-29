class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int max=0,freq=0,i=0; 
        long count=0;  

        for(int m:nums) if(m>max) max = m;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==max) freq++;
            while(k==freq){
                if(nums[i]==max){
                    freq--;
                }
                i++;
             }
             count+=i;
        }
        return count;
    }
}