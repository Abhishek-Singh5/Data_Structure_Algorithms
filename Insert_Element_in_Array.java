// Insert Element in Array at the Specific Position.

import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        // Size of the Array.
        int n = s1.nextInt();
        
        int arr[] = new int [n];
        // Input of the array
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        // position in the array to insert Element.
        int position = s1.nextInt();
        // Value in the array to insert on the position.
        int value = s1.nextInt();
        
        //Taking new array that is n + 1 size.
        int answer[] = new int[n+1];
        
        // Taking two pointer
        int first = 0;
        int second = 0;
        //use while or for loop both.
        for(int i = 0; i < n + 1; i++){
            if(i == position -1){
                answer[i] = value;
            }else{
                answer[i] = arr[second];  //Copying the element arr[] to answer[].
                second++;
            }
            first++;
        }
        
        //Now printion the new Array.
        for(int i = 0; i < n + 1; i++){
            System.out.print(answer[i] + " ");
        }
        
    }
}
