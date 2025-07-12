Example

arr[] = {900, 940, 950, 1100, 1500, 1800}
dep[] = {910, 1200, 1120, 1130, 1900, 2000}

Processing:

At time 900 → +1
At time 910 → -1
At time 940 → +1

... and so on
As the sweep line processes all events, maxValue will track the max platforms in use.

✅ Final Output
      return maxValue;

🧠 Time & Space Complexity:-

        Time Complexity: O(n log n) → due to sorting the 2n events
        Space Complexity: O(n) → storing 2n events in nums








// User function Template for Java

class Solution {
    
    
    
    static int findPlatform(int arr[], int dep[]) {
        
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(arr[i]);
            currentRow.add(1);
            
            nums.add(new ArrayList<>(currentRow));
            currentRow = new ArrayList<>();
            
            currentRow.add(dep[i]);
            currentRow.add(-1);
            
            nums.add(new ArrayList<>(currentRow));
        }
        
        Collections.sort(nums, (x, y) -> Integer.compare(x.get(0), y.get(0)));

        
        int answer = 0;
        int maxValue = 0;
        
        for(int i = 0; i < nums.size(); i++){
            answer += nums.get(i).get(1);
            
            maxValue = Math.max(maxValue, answer);
        }
        
        return maxValue;
    }
}
