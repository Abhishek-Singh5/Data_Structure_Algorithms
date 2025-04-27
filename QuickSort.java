import java.util.*;
class Main{
    
    public static int partition(int start, int end, int arr[]){
        
        int pivot = arr[end];
        int i = start;
        
        for(int j = start; j < end - 1; j++){
            if(arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i++;
            }
        }
        
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        
        
        return i;
        
    }
    
    public static void quickSort(int start, int end, int arr[]){
        
        // base case
        if(start >= end){
            return;
        }
        
        int k = partition(start, end, arr);
        
        quickSort(start, k-1, arr);
        quickSort(k+1, end, arr);
        
    }
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        // TC --> O(n log n)
        quickSort(0, n-1, arr);
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
