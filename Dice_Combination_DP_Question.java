// Dice Combination DP Question

import java.util.*;
class Main{
    
static int MOD = (int)(1e9 + 7);
static int N = (int)(1e6 + 1);
static long dp[] = new long[N];

public static long recursion(int n){
    
    // base case
    if(n == 0){
        return 1;
    }
    
    if(dp[n] != -1){
        return dp[n];
    }
    
    // (a + b) % M = (a % M  + b % M) % M
    
    long answer = 0;
    for(int i = 1; i <= 6; i++){
        if(n >= i){
            answer = (answer%MOD + recursion(n - i)%MOD) % MOD;
        }
    }
    
    dp[n] = answer;
    return answer;
}


public static void main(String []k){
    
    Scanner s1 = new Scanner(System.in);
    int n = s1.nextInt();
    
    
    for(int i = 0; i < N; i++){
        dp[i] = -1;
    }
    
    System.out.println(recursion(n));
}
}
