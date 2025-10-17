class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList();

        Arrays.sort(nums);
        Set<ArrayList<Integer>> set = new HashSet<>();

        int n= nums.length;
        for(int i=0; i<n ;i++){
            int left = i+1, right = n-1;

            while( left < right ){
                int sum= nums[i] + nums[left] + nums[right];
                if( sum==0 ){
                    set.add(new ArrayList<>(List.of(nums[i] , nums[left] , nums[right])));
                    left++;
                    right--;
                }
                else if( sum<0 ){
                    left++;
                }
                else{
                    right--;
                }
            }
        }


        return new ArrayList<>(set) ;
    }
}