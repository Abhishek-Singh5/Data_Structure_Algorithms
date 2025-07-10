Given an array arr containing positive integers. Find the maximum sum of any possible subsequence 
such that no two numbers in the subsequence should be adjacent in array arr.

Examples:

Input: arr[] = [5, 5, 10, 100, 10, 5]
Output: 110
Explanation: If you take indices 0, 3 and 5, then = 5+100+5 = 110.
Input: arr[] = [3, 2, 7, 10]
Output: 13
Explanation: 3 and 10 forms a non continuous subsequence with maximum sum.
Input: arr[] = [9, 1, 6, 10]
Output: 19
Explanation: 9 and 10 forms a non continuous subsequence with maximum sum.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arri ≤ 105







// User function Template for Java

class Solution {
    
    int []dp;

    public int recursion(int nums[], int index){

        // base case
        if(index >= nums.length){
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        // recursive case
        int option1 = nums[index] + recursion(nums, index + 2); // take
        int option2 = recursion(nums, index + 1);  // skip

        int answer = Math.max(option1, option2);
        dp[index] = answer;
        return answer;
    }
    
    int findMaxSum(int arr[]) {
        
         int n = arr.length;

        dp = new int[n];

        for(int i = 0; i < n; i++){
            dp[i] = -1;
        }
        
        return recursion(arr, 0);
        
    }
}
