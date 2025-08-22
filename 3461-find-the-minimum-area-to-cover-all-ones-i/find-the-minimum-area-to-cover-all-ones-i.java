class Solution {
    public int minimumArea(int[][] grid) {
        
        int i_min = Integer.MAX_VALUE ,j_min = Integer.MAX_VALUE;
        int i_max = Integer.MIN_VALUE , j_max = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if( grid[i][j] == 1 ){
                    i_min = Math.min( i_min,i);
                    j_min = Math.min( j_min,j);
                    i_max = Math.max( i_max,i);
                    j_max = Math.max( j_max,j);
                }
            }
        }
        // System.out.println(i_min+" "+j_min +" "+i_max +" "+j_max );

        return ((i_max-i_min)+1)*((j_max-j_min)+1);
    }
}