class Solution {
    public int possibleStringCount(String word) {
        
        int n= word.length();
        int[] freq = new int[26];
        int ans=1;

        for(int i=1;i< n ;i++){
            if( word.charAt(i) == word.charAt(i-1) ) ans++;
            // freq[word.charAt(i)-'a']++;
        }

        
        // for( int fr: freq){
        //     if(fr > 1) ans += fr-1;
        // }
    
    
        return ans;
    }
}