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
        // System.out.println(index+" "+i);

        return index == -1 ? num : num+ 3* (int)Math.pow(10,index) ;
    }
}