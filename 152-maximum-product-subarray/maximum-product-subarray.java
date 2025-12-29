class Solution {
    public int maxProduct(int[] nums) {
        
        int n= nums.length,ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int prod = 1;
            for(int j=i;j<n;j++){
                prod *= nums[j];
                ans = Math.max(ans,prod);
                
            }
            // System.out.println(prod);
        }

        return ans;
    }
}