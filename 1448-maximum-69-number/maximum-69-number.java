class Solution {
    public int maximum69Number (int num) {
        int n= num;
        int index = -1,i=0;
        int curr = -1;
        while( n != 0 ){
            curr = n%10;
            if( curr == 6 ) index = i;
            n/=10;
            i++;
        }

        return index >=0 ?  num+ 3* (int)Math.pow(10,index) : num ;
    }
}