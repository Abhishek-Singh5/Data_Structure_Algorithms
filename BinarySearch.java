import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        int target = s1.nextInt();
        int answer = -1;
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(arr[mid] == target){
                answer = mid;
                break;
                
            }else if(arr[mid] > target){
                end = mid - 1;
                
            }else{
                start = mid + 1;
            }
        }
        
        if(answer == -1){
            System.out.println("Target Not Found");
        }else{
            System.out.println("Target index is :- " + answer);
        }
        
    }
}
