import java.util.Scanner;
class Main{
    
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int m = s1.nextInt();
        
        char arr[][] = new char[n][m];
        
        for(int i = 0; i < n; i++){
            String s = s1.next();
            
            for(int j = 0; j < m; j++){
                arr[i][j] = s.charAt(j);
            } 
        }
        
        int MOD = (int)(1e9 + 7);
        
        int dp[][] = new int[n][m];
        
        int val = 1;
        
        for(int j = 0; j < m; j++){
            if(arr[0][j] == '#'){
                val = 0;
            }
            
            dp[0][j] = val;
        }
        
        val = 1;
        
        for(int i = 0; i < n; i++){
            if(arr[i][0] == '#'){
                val = 0;
            }
            
            dp[i][0] = val;
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[i][j] == '#'){
                    dp[i][j] = 0;
                    
                }else{
                    dp[i][j] = (dp[i-1][j] % MOD + dp[i][j-1] % MOD) % MOD;
                }
            }
        }
        
        System.out.println(dp[n-1][m-1]);
    }
}
