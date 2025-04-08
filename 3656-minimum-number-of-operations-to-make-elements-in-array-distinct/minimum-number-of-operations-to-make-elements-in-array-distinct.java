class Solution {
    public int minimumOperations(int[] nums) {

        boolean[] numDistinct = new boolean[101];
        int ans=0,ind=0;

        for(int i=nums.length-1;i>=0;i--){
            if( numDistinct[nums[i]] ){
                return (i+3)/3;
            }
            else numDistinct[nums[i]]=true;
        }
        return ans;
    }
}