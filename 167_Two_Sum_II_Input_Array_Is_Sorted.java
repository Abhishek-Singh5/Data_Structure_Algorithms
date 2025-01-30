// 167. Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // taking two size of Array where Store the indexes of output. 
        int result[] = new int [2];
        // Assumption Method if we not found any indexes then retun these output.
        result[0] = -1;   
        result[1] = -1;
        
        int n = numbers.length;  // to know about length of numbers Array.
        
        // taking two pointer one is keep on starting and second is keep on Ending.
        int i = 0;
        int j = n - 1;
        
        // using the loop it will never cross to each other.
        while(i <= j){
            int sum = numbers[i] + numbers[j];
            
            if(sum == target){  // if sum is equal to target
                result[0] = i + 1;  // Because indexing start with one
                result[1] = j + 1;
                break;
                
            }else if (sum > target){  // if sum is greater then target.
                j = j - 1;  // decrese the second pointer.
            }else{
                i = i + 1;  // Increase the frist Pointer.
            }
        }
        
        return result;  
        
    }
}
