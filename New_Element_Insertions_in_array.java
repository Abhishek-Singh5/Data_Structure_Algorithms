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
        int value = s1.nextInt();
        
        int answer[] = new int[n+1];
        
        int first = 0;
        for(int second = 0; second < n+1; second++){
            if(second == position - 1){
                answer[second] = value;
            }else{
                answer[second] = arr[first];
                first = first + 1;
            }
        }
        
        for(int i = 0; i<n+1; i++){
            System.out.print(answer[i] + " ");
        }
        
    }
}



// take a two pointer and use the for loop
// index always will be position - 1 because position starts with 1 and index start with 0
// if index == position -1 then push the element in new array that is size th n + 1 size
// after push element all array element is copy in new array.
