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

        // Sum of Right Trigonal
        System.out.println();
         int sum1 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i <= j)
                sum1 = sum1 + arr[i][j];
            }
        }
        System.out.println("Sum of Right Trigonal :- " + sum1);
        
    }
}
