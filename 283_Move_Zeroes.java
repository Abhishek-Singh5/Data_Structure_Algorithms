class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // take a two Pointer
        int i = 0;
        int j = 0;


        while(i < n){
            if(nums[i] != 0){  // if num[i] is not equal to zero
                nums[j] = nums[i];  // so move element in nums[j]
                j++;
            }
            i++;
        }

        while(j < n){
            nums[j] = 0;  // All the non zero element will be zero
            j++;
        }

        // for(int k = 0; k < n; k++){
        //     System.out.print(nums[k] + " ");
        // }
        
    }
}
