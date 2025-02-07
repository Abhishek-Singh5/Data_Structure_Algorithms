import java.util.*;
class Main{
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = s1.nextInt();
        }

        int position = s1.nextInt();
        
        int answer[] = new int[n-1];
        
        int first = 0;
        for(int second = 0; second < n-1; second++){
            if(first == position -1){
                first++;
            }
            answer[second] = arr[first];
            first++;
        }
        
        for(int i = 0; i<n-1; i++){
            System.out.print(answer[i] + " ");
        }
    }
}



// take a two pointer and remove an element from given position
// take a second arr that is n - 1 size
// in the array when coming position element the increase the index
// after that all element copy in second array.
