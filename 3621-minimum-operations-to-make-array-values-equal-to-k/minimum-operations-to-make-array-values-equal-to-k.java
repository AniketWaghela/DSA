class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] map = new boolean[101];

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < k) return -1;
            if( nums[i] > k && !map[nums[i]] ) count++;
            map[nums[i]]=true;
        }

        return count;
    }
}