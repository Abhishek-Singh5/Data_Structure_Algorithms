class Solution {
    public int missingNumber(int[] nums) {
        // frist we take a length of Array.
        int n = nums.length;

        //Then we initilaze the sum integer
        int sum = 0;

        // we add n digit of sum.
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        // Now add sum of array element.
        int sum1 = 0;
        for(int i = 0; i < n; i++){
            sum1 = sum1 + nums[i];
        }

        // Now we substract the digits sum of array element of sum
        int missing = sum - sum1;

        // Return the function of Missing Interger.
        return missing;

    }
}
