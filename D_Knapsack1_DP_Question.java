import java.util.Scanner;
class Main{
    
    static int arr[][];
    static long dp[][];
    
    
    static long recursion(int i, int n, int W){
        
        if(i == n){
            return 0;
        }
        
        if(W <= 0){
            return 0;
        }
        
        if(dp[i][W] != -1){
            return dp[i][W];
        }
        
        long option1 = 0;
        
        if(W >= arr[i][0]){
            option1 = arr[i][1] + recursion(i + 1, n, W - arr[i][0]);
        }
        
        long option2 = recursion(i + 1, n, W);
        
        long answer = Mayh.max(option1, option2);
        
        dp[i][W] = answer;
        return answer;
        
            
    }
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        
        long n = s1.nextInt();
        long W = s1.nextInt();
        
        arr = new int[n][2];
        dp = new long[n][W+1];
        
        for(int i = 0; i < n; i++){
            arr[i][0] = s1.nextInt();
            arr[i][1] = s1.nextInt();
            
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= W; j++){
                dp[i][W] = -1;
            }
        }
        
        System.out.println(recursion(0, n, W));
    }
}
