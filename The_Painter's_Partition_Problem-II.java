class Solution {
    
    public boolean isPossible(long mid, int arr[], int k, int n){
        
        
        n = arr.length;
        int count = 1;
        long time = 0;
        
        for(int i = 0; i < n; i++){
            if(time + arr[i] > mid){
                count++;
                time = arr[i];
                
            } else{
                time += arr[i];
                
            }
        }
        
        if(count <= k){
            return true;
        }else{
            return false;
        }
        
    }
    
    public int minTime(int[] arr, int k) {
        
        // step - 1
        // k = 1 (sum)
        // k = N (maximum of the array)
        
        
        int n = arr.length;
        long sum = 0;
        long maxValue = 0;
        
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            maxValue = Math.max(maxValue, arr[i]);
        }
        
        
        long start = maxValue;
        long end = sum;
        long answer = end;
        
        while(start <= end){
            long mid = (start + end) / 2;
            
            if(isPossible(mid, arr, k, n) == true){
                answer = mid;
                end = mid - 1;
                
            }else{
                start = mid + 1;
            }
        }
        
        return (int)answer;
    }
}
