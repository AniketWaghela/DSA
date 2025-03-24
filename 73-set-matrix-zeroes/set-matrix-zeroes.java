class Solution {
    public void setZeroes(int[][] matrix) {

        HashMap<Integer ,Boolean> zeroRow = new HashMap<>();
        HashMap<Integer ,Boolean> zeroCol = new HashMap<>();
        
        for(int i=0;i< matrix.length; i++) {
            for(int j=0;j< matrix[0].length ;j++){
                if(matrix[i][j] == 0){
                    zeroRow.put(i,true);
                    zeroCol.put(j,true);
                }
            }
        }

        for(int i=0;i< matrix.length; i++) {
            for(int j=0;j< matrix[0].length ;j++){
                if( zeroRow.containsKey(i)  || zeroCol.containsKey(j)  ){
                    matrix[i][j] = 0;
                }
            }
        }

        
    }
}