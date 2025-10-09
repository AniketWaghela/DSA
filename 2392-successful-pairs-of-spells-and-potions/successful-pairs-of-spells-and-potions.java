class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n= spells.length , m = potions.length;
        int ans[] = new int[n];
        

        for(int i=0; i<n ;i++){
            
            int left = 0 , right = m-1;

            while( left <= right ){
                int mid = left + (right-left) / 2; 
                if( (long)potions[mid]*spells[i] >= success ){
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            ans[i] = m-left;
        }


        return ans;
    }
}