class Solution {
    public int maximumDifference(int[] nums) {
        
        int max = Integer.MIN_VALUE , n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j] - nums[i] > 0) max = Math.max( max , nums[j] - nums[i] );
                // System.out.println(i);
            }
        }

        return max<0 ? -1: max;
    }
}