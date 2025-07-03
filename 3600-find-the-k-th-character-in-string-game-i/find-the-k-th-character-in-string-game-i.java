class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        while( sb.length() < k ){
            StringBuilder gameStr = new StringBuilder();
            for(int i=0;i< sb.length(); i++){
                gameStr.append((char)(sb.charAt(i)+1));
            }
            sb.append(gameStr);
        }
        // System.out.println(sb);

        return sb.toString().charAt(k-1);
    }
}