class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        int n = arr.length;
        int sum = 0;
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(map.containsKey(sum - k)){
                answer = Math.max(answer, (i - map.get(sum - k)));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        
        return answer;
    }
}
