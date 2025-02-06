import java.util.*;
class Main{
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = s1.nextInt();
        }

        int answer[] = new int[n];
        
        int secondPointer = 0;
        for(int firstPointer = 0; firstPointer < n; firstPointer++){
            answer[secondPointer] = arr[firstPointer];
            secondPointer++;
        }
        
        
        for(int i = 0; i<n; i++){
            System.out.print(answer[i] + " ");
        }
        
    }
}



// using two pointer approach that is copying array element and paste in to another array.
// logic is simple answer index keeping arr index element and moving forward using ++
