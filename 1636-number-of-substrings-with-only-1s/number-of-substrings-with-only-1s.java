class Solution {
    public int numSub(String s) {
        
        long n= s.length(),count=0,ans=0;
        for(int i=0;i<n;i++){
            if( s.charAt(i) == '1' ) count++;
            else count =0;
            ans = (ans+ count) % 1000000007;
        }
        return (int)ans % 1000000007;
    }
}