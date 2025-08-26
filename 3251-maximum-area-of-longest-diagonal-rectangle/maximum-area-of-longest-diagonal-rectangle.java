class Solution {
    public int areaOfMaxDiagonal(int[][] dm) { // dm = dimensions
        
        int n= dm.length;
        double diagonal = -1;
        int area = -1;
        for(int i=0; i<n ;i++){
            double curr_diagonal = Math.sqrt(dm[i][0]*dm[i][0] + dm[i][1]*dm[i][1] );

            if( curr_diagonal > diagonal ){
                area = dm[i][0]*dm[i][1];
                diagonal = curr_diagonal;
            }
            else if(curr_diagonal == diagonal ){
                area = Math.max( area , dm[i][0]*dm[i][1] );
                diagonal = curr_diagonal;
            }
            // System.out.println( curr_diagonal +" "+ diagonal +" "+ area);
        }

        return area;
    }
}