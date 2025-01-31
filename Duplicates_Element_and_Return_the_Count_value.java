// Find the Duplicates Element and Return the Count value.

import java.util.*;
class Main {
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        int arr[] = new int [n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }

        int maximumNum = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > maximumNum){
                maximumNum = arr[i];
            }
        }

// Creating the Frequency Array: We now create a frequency array of size maximumNum + 1 = 7:

// frequency = [0, 0, 0, 0, 0, 0, 0]
// Populating the Frequency Array: The next loop iterates over the 
// original array arr[] and increments the corresponding index in the frequency array:

// For i = 0:

// arr[0] = 5, so frequency[5]++ → frequency[5] = 1
// frequency = [0, 0, 0, 0, 0, 1, 0]
// For i = 1:

// arr[1] = 3, so frequency[3]++ → frequency[3] = 1
// frequency = [0, 0, 0, 1, 0, 1, 0]
// For i = 2:

// arr[2] = 2, so frequency[2]++ → frequency[2] = 1
// frequency = [0, 0, 1, 1, 0, 1, 0]
// For i = 3:

// arr[3] = 5, so frequency[5]++ → frequency[5] = 2
// frequency = [0, 0, 1, 1, 0, 2, 0]
// For i = 4:

// arr[4] = 3, so frequency[3]++ → frequency[3] = 2
// frequency = [0, 0, 1, 2, 0, 2, 0]
// For i = 5:

// arr[5] = 6, so frequency[6]++ → frequency[6] = 1
// frequency = [0, 0, 1, 2, 0, 2, 1]
// After this loop, the frequency array is:

// frequency = [0, 0, 1, 2, 0, 2, 1]
// Counting Duplicate Numbers: The program now counts how many numbers appear more than once. 
// This is done by checking for values in the frequency array that are greater than or equal to 2:

// For i = 0: frequency[0] = 0, no duplicates.
// For i = 1: frequency[1] = 0, no duplicates.
// For i = 2: frequency[2] = 1, no duplicates.
// For i = 3: frequency[3] = 2, which is greater than or equal to 2 → count++ → count = 1
// For i = 4: frequency[4] = 0, no duplicates.
// For i = 5: frequency[5] = 2, which is greater than or equal to 2 → count++ → count = 2
// For i = 6: frequency[6] = 1, no duplicates.
        
        int frequency[] = new int[maximumNum + 1];
        
        for(int i = 0; i < n; i++){
            frequency[arr[i]]++;
        }
        
        int count = 0;
        for(int i = 0; i < maximumNum + 1; i++){
            if(frequency[i] >= 2){
                count++;
            }
        }
        
        System.out.println("Duplicate number is :- " + count);
        
    }
}
