You are given a set of activities, each with a start time and a finish time, represented by the arrays start[] and finish[], 
respectively. A single person can perform only one activity at a time, meaning no two activities can overlap. 
Your task is to determine the maximum number of activities that a person can complete in a day.


  
Examples:

Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: A person can perform at most four activities. The maximum set of activities that can be executed is {0, 1, 3, 4}
Input: start[] = [10, 12, 20], finish[] = [20, 25, 30]
Output: 1
Explanation: A person can perform at most one activity.
Input: start[] = [1, 3, 2, 5], finish[] = [2, 4, 3, 6]
Output: 3
Explanation: A person can perform activities 0, 1 and 3.
Constraints:
1 ≤ start.size() = finish.size() ≤ 2*105
0 ≤ start[i] ≤ finish[i] ≤ 109









  
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        
        List<List<Integer>> arr = new ArrayList<>();
        int n = start.length;
        
        for(int i = 0; i < n; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(finish[i]);
            currentRow.add(start[i]);
            
            arr.add(new ArrayList<>(currentRow));

        }
        
        Collections.sort(arr, (a, b) -> Integer.compare(a.get(0), b.get(0)));
        
        int answer = 1;
        int prevEndingTime = arr.get(0).get(0);
        
        
        for(int i = 1; i < n; i++){
            int startTime = arr.get(i).get(1);
            if(startTime > prevEndingTime){
                prevEndingTime = arr.get(i).get(0);
                answer++;
            }
        }
        
        return answer;
    }
}
