package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNum = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            distinctNum.add(nums[i]);
        }
        
        return nums.length != distinctNum.size();
    }
}
