import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        
        int arr[] = new int[n];
        
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        for(int i = 1; i < n; i++){
            int element = arr[i];
            int j = i - 1;
            
            while(j >= 0){
                if(arr[j] > element){
                    arr[j+1] = arr[j];
                    j--;
                }
            }
            
            arr[j+1] = element;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
