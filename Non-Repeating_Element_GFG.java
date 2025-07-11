Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

Note: The array consists of only positive and negative integers and not zero.

Examples:

Input: arr[] = [-1, 2, -1, 3, 2]
Output: 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 
Input: arr[] = [1, 1, 1]
Output: 0
Explanation: There is not present any non-repeating element so answer should be 0.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= arr.size <= 106
-109 <= arr[i] <= 109
arr[i] != 0 












  class Solution {
    public int[] firstNonRepeating(int[] arr) {

        int x = 0;

        for (int num : arr) {
            x ^= num; // XOR of the two non-repeating numbers
        }

        // Find rightmost set bit in x
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & (1 << i)) != 0) {
                index = i;
                break; // ✅ break after finding the first set bit
            }
        }

        int X = 0, Y = 0;

        for (int num : arr) {
            if ((num & (1 << index)) != 0) {
                X ^= num;
            } else {
                Y ^= num;
            }
        }

        int[] answer = new int[]{X, Y};
        Arrays.sort(answer); // Sort to return in increasing order
        return answer;
    }
}
