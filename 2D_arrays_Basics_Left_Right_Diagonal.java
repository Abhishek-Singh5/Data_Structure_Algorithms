// 2D arrays Basics
import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        int row = s1.nextInt();
        int column = s1.nextInt();
        
        int arr[][] = new int [row][column];
        
        // Taking input of the 2D Arrays
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = s1.nextInt();
            }
        }
        System.out.println();
        // Just print the 2D Arrays Using Nested Loop
        System.out.println();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        // Opposite way print start with column end with row
        
        System.out.println();
        for(int j = 0; j < column; j++){
            for(int i = 0; i < row; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // left Diagonal Elements print
        System.out.println();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        // Right Diagonal Elements print
         System.out.println();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(i + j == row - 1){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        
        
    }
}

