package leetcode;

import java.util.Arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        int[] tempArr = Arrays.copyOf(nums, nums.length);
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++){
            if(tempArr[i] == 0){
                zeroCount++;
            } else{
                nums[i-zeroCount] = tempArr[i];
            }
        }
        
        for(int i=0; i< zeroCount; i++){
            nums[nums.length-zeroCount+i] = 0;
        }
    }
}
