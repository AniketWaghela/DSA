class Solution {
    public boolean isPowerOfThree(int n) {
        return power(n);
    }

    private static boolean power(int n){
        if( n==1 ) return true;
        if(n <= 0 || n%3 != 0) return false;
        return  power(n/3);
    }
}