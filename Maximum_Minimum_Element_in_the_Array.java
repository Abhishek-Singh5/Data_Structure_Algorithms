// Find the Maximum and Minimum in the Array.

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
        
         //using Assumption Method
        int max = arr[0]; 
        int min = arr[0];
        
        for(int i = 1; i < n; i++){
            // Finding the Maximum Element in the Array
            if(arr[i] > max){
                max = arr[i];
            }
            // Finding the Minimum Element in the Array
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
        
        System.out.println("Maximum is :- " + max);
        System.out.println("Minimum is :- " + min);
    }
}
