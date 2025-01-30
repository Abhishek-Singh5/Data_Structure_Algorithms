// Print the SubArrays of the Arrays.

import java.util.*;
class Main{
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        // Size of the Array.
        int n = s1.nextInt();
        
        int arr[] = new int [n];
        // Input of the array
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        // Taking a Nested for loop to print SubArrays
        for(int i = 0; i < n; i++){   // i ---> Fixed Point or Starting point
            for(int j = i; j < n; j++){   // Where to start the loop or Ending point
                for(int k = i; k <= j; k++){  // i to j to printing Values
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  // to change the line
            }
        }
    }
}
