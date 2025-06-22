class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n =s.length();
        int groups = (n+k-1)/k;
        String[] ans = new String[groups];

        for(int i=0;i<groups;i++){
            StringBuilder group = new StringBuilder();
            for(int j=0;j<k;j++){
                int index = i*k+j;
                if(index < n){
                    group.append(s.charAt(index));
                }
                else{
                    group.append(fill);
                }
            }
            ans[i] = group.toString();
        }

        return ans;
    }
}