package leetcode;

import java.util.Arrays;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        int[] tempArr = Arrays.copyOf(nums, nums.length);
        
        for(int i= 0; i < nums.length; i++){
            nums[(i+k)%nums.length] = tempArr[i];
        }
    }
}
