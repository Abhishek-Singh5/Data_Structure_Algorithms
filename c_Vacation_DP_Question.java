import java.util.Scanner;
class Main{
    
    static int arr[][];
    static int dp[][];
    
    
    static int recursion(int i, int n, int lA){
        
        if(i == n){
            return 0;
        }
        
        if(dp[i][lA] != -1){
            return dp[i][lA];
        }
        
        if(i == 0){
            int option1 = arr[i][0] + recursion(i + 1, n, 0);
            int option2 = arr[i][1] + recursion(i + 1, n, 1);
            int option3 = arr[i][2] + recursion(i + 1, n, 2);
            
            int answer = Math.max(option1, Math.max(option2, option3));
            return answer;
            
        }else{
            
            int answer = 0;
            for(int j = 0; j <= 2; j++){
                
                if(lA != j){
                    int currentOption = arr[i][j] + recursion(i+1, n, j);
                    answer = Math.max(answer, currentOption);
                }
                
            }
            
            
            dp[i][lA] = answer;
            return answer;
            
        }
    }
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        arr = new int[n][3];
        dp = new int[n][3];
        
        for(int i = 0; i < n; i++){
            arr[i][0] = s1.nextInt();
            arr[i][1] = s1.nextInt();
            arr[i][2] = s1.nextInt();
            
            
            dp[i][0] = -1;
            dp[i][1] = -1;
            dp[i][2] = -1;
        }
        
        System.out.println(recursion(0, n, 0));
    }
}
