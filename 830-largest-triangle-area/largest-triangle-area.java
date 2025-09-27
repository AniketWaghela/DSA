class Solution {

    private double areaOfTriangle( int x1 , int y1 , int x2 , int y2 , int x3 , int y3 ){
        // return Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        return 0.5 * Math.abs( (x2-x1)*(y3-y1) - (y2-y1)*(x3-x1) );
    }

    public double largestTriangleArea(int[][] points) {
        
        double ans = 0;
        int n= points.length;

        for( int i=0; i<n ;i++){
            for(int j=i+1; j<n ;j++){
                for(int k=j+1; k<n ;k++){
                    double area = areaOfTriangle(
                        points[i][0] , points[i][1] , 
                        points[j][0] , points[j][1] , 
                        points[k][0] , points[k][1]
                    );
                    ans = Math.max( ans , area );
                }
            }
        }

        return ans;
    }
}