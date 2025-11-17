class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        int n = nums.length,j=-1;
        for(int i=0;i<n;i++){
            
            if(nums[i] ==1 ){
                if( i-j-1 < k && j!=-1){
                    // System.out.println(i+" "+j);
                    return false;
                }
                j=i;
            }
        }

        return true;
    }
}