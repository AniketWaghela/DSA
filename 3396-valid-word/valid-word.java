class Solution {
    public boolean isValid(String word) {

        int length = word.length(), con=0,vov=0;
        if(length <3) return false;

        for(int i=0;i< length; i++){
            char currChar = word.toLowerCase().charAt(i);

            if( currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar =='o' || currChar == 'u'){
                vov++;
            } 
            else if( ( (int)currChar >=97 && (int)currChar <= 122 )  ){
                con++;
                // System.out.println(currChar);
            }
            else if(  (int)currChar >57 || (int)currChar < 48   ){
                // System.out.println((int)currChar+" "+currChar);
                return false;
            }
        }

        return vov>0 && con>0 ? true : false;
    }
}