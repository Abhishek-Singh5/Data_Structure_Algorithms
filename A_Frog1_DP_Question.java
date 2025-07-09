import java.ytil.Scanner;
class Main{
    
    static int arr[];
    static int dp[];
    
    
    static int recursion(int i, int n){
        
        if(i == n-1){
            return 0;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        int option1 = (int)(1e9);
        int option2 = (int)(1e9);
        
        if(i + 1 < n){
            option1 = Math.abs(arr[i+1] - arr[i]) + recursion(i+1, n);
        }
        
        
        if(i + 2 < n){
            option2 = Math.abs(arr[i+2] - arr[i]) + recursion(i+2, n);
        }
        
        int answer = Math.min(option1, option2);
        dp[i] = answer;
        return answer;
    }
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        
        arr = new int[n];
        dp = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
            dp[i] = -1;
        }
        
        System.out.println(recursion(0, n));
    }
}
