import java.util.*;
public class Main{
    public static int solve(int arr[], int b){
        int n = arr.length;
        
        int sum = 0;
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for(int i = 0; i < n; i++){
            sum = sum ^ arr[i];
            
            answer += map.getOrDefault((sum ^ b), 0);
            map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        
        return answer;
    }
    
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        int b = s1.nextInt();
        
        int result = solve(arr, b);
        
        System.out.println(result);
    }
}



