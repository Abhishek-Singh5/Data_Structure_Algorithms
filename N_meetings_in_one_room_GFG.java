You are given timings of n meetings in the form of (start[i], end[i]) where start[i] is the start time of meeting i and end[i] is 
the finish time of meeting i. Return the maximum number of meetings that can be accommodated in a single meeting room, 
when only one meeting can be held in the meeting room at a particular time. 

Note: The start time of one chosen meeting can't be equal to the end time of the other chosen meeting.



  
Examples :

Input: start[] = [1, 3, 0, 5, 8, 5], end[] =  [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: Maximum four meetings can be held with given start and end timings. The meetings are - (1, 2), (3, 4), (5,7) and (8,9)
Input: start[] = [10, 12, 20], end[] = [20, 25, 30]
Output: 1
Explanation: Only one meetings can be held with given start and end timings.
Input: start[] = [1, 2], end[] = [100, 99]
Output: 1
  
Constraints:
1 ≤ n ≤ 105
0 ≤ start[i] < end[i] ≤ 106










  class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = start.length;
        
        for(int i = 0; i < n; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(end[i]);
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
