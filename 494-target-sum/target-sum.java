class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sumArr = 0;
        for(int currInt: nums) sumArr += currInt;
        if (Math.abs(target) > sumArr || (sumArr + target) % 2 != 0) return 0;
        int sum = (target+sumArr)/2;

        return CountOfSubsetSum(nums,sum);
    }

    private static int CountOfSubsetSum(int nums[] , int sum){
        int n= nums.length;
        int[][] t = new int[n+1][sum+1];

        for(int i=0;i<=n;i++) t[i][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){

                if( nums[i-1] <= j ){
                    t[i][j] = t[i-1][j] + t[i-1][j-nums[i-1]];
                }
                else{
                    t[i][j] =  t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}