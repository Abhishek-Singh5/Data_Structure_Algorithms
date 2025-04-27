import java.util.*;
class Main{
    
    public static void merge(int arr[], int start, int mid, int end){
        
        ArrayList<Integer> sortedMerge = new ArrayList<>();
        
        // first part (start -- mid)
        
        int i = start;
        
        // Second part (mid + 1 -- end)
        
        int j = mid + 1;
        
        while(i <= mid  &&  j <= end){
            if(arr[i] <= arr[j]){
                sortedMerge.add(arr[i]);
                i++;
            }else{
                sortedMerge.add(arr[j]);
                j++;
            }
        }
        
        while(j <= end){
            sortedMerge.add(arr[j]);
            j++;
        }
        
        while(i <= mid){
            sortedMerge.add(arr[i]);
            i++;
        }
        
        int index = 0;
        
        for(int k = start; k <= end; k++){
            arr[k] = sortedMerge.get(index);
            index++;
        }
        
    }
    
    
    public static void mergeSort(int start, int end, int arr[]){
        
        // base case
        if(start >= end){
            return;
        }
        
        // recursive case
        int mid = (start + end) / 2;
        
        mergeSort(0, mid, arr);
        mergeSort(mid+1, end, arr);
        
        merge(arr, start, mid, end);
        
    }
    
    
    public static void main(String []q){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        mergeSort(0, n-1, arr);
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
