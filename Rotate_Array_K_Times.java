// Rotate Array K times 
import java.util.*;
class Main{
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();  // Size of Array
        int k = s1.nextInt();  // How many time of Rotation
        int arr[] = new int [n];
        
        //Input Array
        for(int i = 0; i<n; i++){
            arr[i] = s1.nextInt();
        }
        
        // To store Revesed Array aize of original Array
        
        int reversed[] = new int[n];
        
            // Modify k to handle cases where k >= n
            // k = k % n = 2 % 5 = 2
            // So, k = 2, which means we will rotate 
            // the array 2 positions to the left.
            
        k = k % n;
        
        
        for(int i = 0; i < n; i++){
            int newIndex = (i - k);  // 0 - 2 = -2  | 1 - 2 = -1
            if(newIndex < 0){       // newIndex is less then zero
                newIndex = newIndex + n;  // then add size of array
            }
            
            reversed[newIndex] = arr[i];  // keep value on the newIndex of arr[i]
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(reversed[i] + " ");
        }
    }
}
