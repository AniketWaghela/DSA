class Solution {
    public int maxFreqSum(String s) {
        
        int n= s.length();
        int freq[] = new int[26];

        for( int i=0; i<n ;i++){
            freq[ s.charAt(i)-'a']++;
        }
        int max_consonant = Integer.MIN_VALUE , max_vowel = Integer.MIN_VALUE;
        for( int i=0; i<26 ;i++){
            
            if( (char)(i+97) == 'a' || (char)(i+97) == 'e' || (char)(i+97) == 'i' || (char)(i+97) == 'o' || (char)(i+97) == 'u' ){
                max_vowel = Math.max( max_vowel , freq[i]);
            }
            else max_consonant = Math.max( max_consonant , freq[i]);
        }
        // System.out.println(max_vowel+" "+max_consonant);
        return max_vowel+max_consonant;
    }
}