Given a matrix cost of size n where cost[i][j] denotes the cost of moving from city i to city j. Your task is to complete a tour 
from city 0 (0-based index) to all other cities such that you visit each city exactly once and then at the end come back to city 0 at minimum cost.

Examples:

Input: cost = [[0, 111], [112, 0]]
Output: 223
Explanation: We can visit 0->1->0 and cost = 111 + 112.
Input: cost = [[0, 1000, 5000], [5000, 0, 1000], [1000, 5000, 0]]
Output: 3000
Explanation: We can visit 0->1->2->0 and cost = 1000+1000+1000 = 3000
Constraints:
1 <= cost.size() <= 20
1 <= cost[i][j] <= 103
















class Solution {
    public int tsp(int[][] cost) {
        
        int n = cost.length;
        int [][]dp = new int[n][1 << n];
        
        for(int []row : dp) {
            Arrays.fill(row, -1);
        }
        
        return dfs(0, 1, cost, dp);
    }
    
    public int dfs(int pos, int mask, int [][]cost, int [][]dp) {
        int n = cost.length;
        
        int visited_All = (1 << n) - 1;
        
        if(mask == visited_All) {
            return cost[pos][0];
        }
        
        if(dp[pos][mask] != -1) {
            return dp[pos][mask];
        }
        
        int minCost = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if((mask & (1 << i)) == 0) {
                int newCost = cost[pos][i] + dfs(i, mask | (1 << i), cost, dp);
                minCost = Math.min(minCost, newCost);
            }
        }
        
        dp[pos][mask] = minCost;
        return minCost;
    }    
}
