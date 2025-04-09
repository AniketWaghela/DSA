class Solution {
    public int minOperations(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < k) return -1;
            if( nums[i] > k && !map.containsKey(nums[i]) ) count++;
            map.put( nums[i] , map.getOrDefault(nums[i],0)+1 );
        }

        System.out.println(map);
        return count;
    }
}