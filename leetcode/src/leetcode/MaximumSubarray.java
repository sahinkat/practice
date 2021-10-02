package leetcode;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            currentSum += nums[i];
            if(currentSum < nums[i]){
                currentSum = nums[i];
            }
            
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}
