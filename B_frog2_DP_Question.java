

import java.util.Scanner;
class Main{
    
    static int arr[];
    static int dp[];
    
    
    static int recursion(int i, int n, int k){
        
        if(i >= n-1){
            return 0;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        
        int answer = (int)(1e9);
        
        for(int j = 1; j <= k; j++){
            
            if((i + j) < n ){
                answer = Math.min(answer, (Math.abs(arr[i + j] - arr[i]) + recursion(i+j, n, k)));
            }
            
        }
        
        
        
        
        dp[i] = answer;
        return answer;
    }
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int k = s1.nextInt();
        
        arr = new int[n];
        dp = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
            dp[i] = -1;
        }
        
        System.out.println(recursion(0, n, k));
    }
}
