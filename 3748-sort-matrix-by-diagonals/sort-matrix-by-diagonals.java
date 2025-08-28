
class Solution {


    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        int a=0,b=0,c=0;

        for(int i=n-1; i>=0 ;i--){
            a =c++; 
            b =0;
            int[] arr = new int[i+1];
            for(int j=0; j<=i ;j++){
                arr[j] = grid[a++][b++];
            }
            Arrays.sort(arr);
            for (int k = 0; k < arr.length / 2; k++) {
                int temp = arr[k];
                arr[k] = arr[arr.length - 1 - k];
                arr[arr.length - 1 - k] = temp;
            }
            a = c-1;
            b=0;
            for(int j=0; j<=i ;j++){
                grid[a++][b++] = arr[j];
            }
        }
        c=1;
        for(int i=n-2; i>=0 ;i--){
            b =c++; 
            a =0;
            int[] arr = new int[i+1];
            for(int j=0; j<=i ;j++){
                arr[j] = grid[a++][b++];
            }
            Arrays.sort(arr);
            b = c-1;
            a=0;
            for(int j=0; j<=i ;j++){
                grid[a++][b++] = arr[j];
            }
        }
        return grid;
    }
}