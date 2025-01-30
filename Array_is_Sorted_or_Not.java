// Find the Array is Sorted or Not.

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
        
        // Using Boolean Method
        boolean sort = true;
        
        // loop is going to the 0 Index to end of the index;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){  // if arr[0] greater then arr[1] --> return false.
                sort = false;
                break;
            }
        }
        
        // Using condition Sorted Or Not
        if(sort){
            System.out.println("Array is Sorted");
        }else{
            System.out.println(" Not Sorted ");
        }
    }
}
