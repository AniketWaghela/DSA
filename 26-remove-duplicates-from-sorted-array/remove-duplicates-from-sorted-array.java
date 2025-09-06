class Solution {
    public int removeDuplicates(int[] nums) {
        
        int left =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right =0;right< nums.length;right++){
            if( !map.containsKey(nums[right]) ){
                nums[left++] = nums[right];
            }
            map.put( nums[right] , map.getOrDefault( nums[right],0)+1 );
        }

        return left;
    }
}