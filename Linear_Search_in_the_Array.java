// Linear Search in the Array.

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
        
        // Now taking input of target to find the array.
        int target = s1.nextInt();
        
        int answer = -1;  //using Assumption Method
        
        for(int i = 0; i < n; i++){
            if(arr[i] == target){  
                answer = i;   // index puting in the answer
            }
        }
        // using condition if target is not Exits in the Array
        if(answer > -1){
            System.out.println("Index is :- " + answer);
        }else{
            System.out.println("Not Exists");
        }
  
    }
}
