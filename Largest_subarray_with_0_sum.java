class Solution {
    int maxLen(int arr[]) {
        
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int answer = 0;
        int sum = 0;
        
        map.put(0, -1);
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(map.containsKey(sum)){
                answer = Math.max(answer, (i - map.get(sum)));
                
            }else{
                map.put(sum, i);
            }
            
        }
        
        return answer;
        
    }
