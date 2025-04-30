class Solution {

    private boolean evenNumberDigit(int num){
        int count=0;
        while( num>0 ){
            count++;
            num/=10;
        }

        return count%2 ==0 ? true :false;  
    }

    public int findNumbers(int[] nums) {
        int count=0;

        for(int i: nums){
            if(evenNumberDigit(i)){
                count++;
            }
        }

        return count;
    }
}