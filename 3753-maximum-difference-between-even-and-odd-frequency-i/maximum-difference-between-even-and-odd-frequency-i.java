class Solution {
    public int maxDifference(String s) {

        int n= s.length();
        int[] freq = new int[26];
        int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i: freq){
            if( i%2 == 0 && i!=0 ) min= Math.min( min,i);
            else max = Math.max( max,i);
        }

        return max-min;
    }
}