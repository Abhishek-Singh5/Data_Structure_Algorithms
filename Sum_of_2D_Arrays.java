import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        
        int arr[][] = new int [n][n];
        
        // Taking input of the 2D Arrays
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = s1.nextInt();
            }
        }
        
        System.out.println();
        // Sum of All Elements in 2D Arrays
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum = sum + arr[i][j];
            }
            
        }
        System.out.println(sum);
        
        System.out.println();
        // Sum of Row Elements in 2D Arrays
         int sum1 = 0;
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                sum1 = sum1 + arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( "---> " + sum1);
        }
        
        
    }
}
