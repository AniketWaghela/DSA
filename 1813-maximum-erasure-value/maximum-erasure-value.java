class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int n = nums.length;
        int left=0;
        int currSum =0;
        int ans =0;

        HashMap<Integer,Integer> uniqueElementSet = new HashMap<>();
        for(int right=0 ; right < n ; right++){

            uniqueElementSet.put(nums[right], uniqueElementSet.getOrDefault( nums[right] , 0)+1  );
            currSum += nums[right];

            while( (right - left + 1) > uniqueElementSet.size() ){
                int freq = uniqueElementSet.get( nums[left] );
                if( freq == 1 ) uniqueElementSet.remove( nums[left] );
                else  uniqueElementSet.put( nums[left] , freq-1);
                currSum -= nums[left++];
            } 
            ans = Math.max( ans , currSum);
        }

        return ans;
    }
}