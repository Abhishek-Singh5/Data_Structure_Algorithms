class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if(n == 1){
            return 1;
        }

        int result = 0;

        for(int i = 0; i < n; i++){ // frist point 
            for(int j = i+1; j < n; j++){  // second point 

                int count = 2;

                int dx = points[j][0] - points[i][0];  // (x2 - x1)
                int dy = points[j][1] - points[i][1];  // (y2 - y1)

                /*

                    dy/dx == dy_/dx_
                    dx*dy_ == dy*dx_

                */

                for(int k = 0; k < n; k++){

                    if(k != i && k != j){

                        int dx_ = points[k][0] - points[i][0]; // (x3 - x1)
                        int dy_ = points[k][1] - points[i][1]; // (y3 - y1)

                        if(dy * dx_ == dy_*dx){
                            count++;
                        }
                    }
                }

                result = Math.max(result, count);

            }
        }

        return result;
    }
}
