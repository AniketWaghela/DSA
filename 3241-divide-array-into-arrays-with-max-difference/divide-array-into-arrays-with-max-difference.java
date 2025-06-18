class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int rowNums = nums.length/3;
        int[][] arr = new int[rowNums][3];

        Arrays.sort(nums);
        int index =0;
        boolean flag=true;
        for(int i=0;i<nums.length;i+=3){
            // System.out.println( nums[i]+" "+nums[i+1]+" "+nums[i+2]);
            if( nums[i+2] - nums[i] <= k){
                arr[index][0] = nums[i];
                arr[index][1] = nums[i+1];
                arr[index++][2] = nums[i+2];
            }
            else{
                flag = false;
            }
            
            
        }
        
        return flag ? arr : new int[][]{};

    }
}