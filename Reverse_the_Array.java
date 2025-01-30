// Reverse the Array.

import java.util.*;
class Main{
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        // Size of Array
        int n = s1.nextInt();
        int arr[] = new int [n];
        
        // Taking input of array
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        // Using two pointer when we are reverse the Array.
        // In two poiner always use while loop.
        // two pointer means that two variables
        
        int i = 0;  // Starting point
        int j = n - 1;  // Ending point
        
        while(i < j) {   // i will never cross j. And i is equalto j then not Swapping.
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;   // Moving in right direction;
            j--;   // Moving in backward direction;
        }
        
        // Now Printing the Reverse Array
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
        
    }
}
