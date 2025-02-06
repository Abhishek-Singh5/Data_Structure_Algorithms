import java.util.*;
class Main{
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = s1.nextInt();
        }
        
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        int frequency[] = new int[max + 1];
        
        for(int i = 0; i < n; i++){
            frequency[arr[i]]++;
        }
        
        for(int i = 0; i < max + 1; i++){
            if(frequency[i] > 0)
            System.out.print(frequency[i] + " ");
        }
        
    }
}



