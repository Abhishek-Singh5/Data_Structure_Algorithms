class Main {
    
    // STATE -> Number of parameters changing in recursion
    // 1 parameter --> 1D DP (1D Array)
    // 2 parameter --> 2D DP (2D Array)
    // 3 parameter --> 3D DP (3D Array)
    // Digit DP -> 7D DP (Max) (HARD)
    
    // SC ~ Extra Array ~ STATE
    // TC = Transition Time * SC
    
    // Transition Time (TT) ~ Moving from one recursion call to another call
    
    
    // Steps of Solving DP Question
    // 1 -> Parameters needed in recursion
    // 2 -> Base and recursive casr need to be figured out
    // 3 -> Recursive Case - Option concept
    // 4 -> Memorize the recursion
        // a -> If this is already calculated
        // b -> if not calculated store it in dp array
        
        
    // State -> Number of parameters changing in recursion is called STATE of DP 
    
    
    
    
    // State -> 1
    // Space Complexity -> O(N)
    // Time Complexity -> TT * SC  =  1 * N = O(N)
    
    static final int N = (int)1e5 + 1;
    static int dp[];
    public static int fibo(int n){
        
        // base case
        if(n <= 1){
            dp[n] = n;
            return n;
        }
        
        // if not -1 it mens it is calculated, dp[n 
        if(dp[n] != -1){
            return dp[n];
        }
        
        // recursive case
        // if it is -1 then we calculated
        int answer = fibo(n -1) + fibo(n -2);
        dp[n] = answer;
        return answer;
    }
    
    public static void main(String []k){
        
        dp = new int[N];
        
        for(int i = 0; i < N; i++){
            dp[i] = -1;
        }
        
        
        fibo(20);
        
        for(int i = 0; i < 30; i++){
            System.out.print(dp[i] + " ");
        }
        
    }
}


