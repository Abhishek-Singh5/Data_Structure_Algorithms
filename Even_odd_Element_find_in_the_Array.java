// Print the Even and Odd Element in the Arrays.

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
        
        
        int evenCount = 0;
        int oddCount = 0;
        // count the even & odd Element in the Arrays
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        
        // Even Element must be Greater then Zero
        if(evenCount > 0){
            System.out.println("Even Elements");
            for(int i = 0; i < n; i++){  // using loop & modules print Event Element
                if(arr[i] % 2 == 0){     
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();  // change the line
        
        // Odd Element must be Greater then Zero
        System.out.println("Odd Elements");
        if(oddCount > 0){
            for(int i = 0; i < n; i++){   // using loop & modules print Event Element
                if(arr[i] % 2 != 0){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        
    }
}
