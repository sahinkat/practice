package leetcode;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        return binarySearchInsert(nums, 0, nums.length-1, target);
    }
    
    private int binarySearchInsert(int[] nums, int start, int end, int target){
        if(end >= start) {
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                return binarySearchInsert(nums, start, mid-1, target);
            }
            
            return binarySearchInsert(nums, mid+1, end, target);
        }
        
        return start;
    }
}
