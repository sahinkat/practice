package leetcode;

public class BinarySearch {
	public int search(int[] nums, int target) {
        return this.binarySearch(nums, 0, nums.length-1, target);
    }
    
    private int binarySearch(int nums[], int start, int end, int target){
        if(end >= start){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                return binarySearch(nums, start, mid-1, target);
            }
            
            return binarySearch(nums, mid+1, end, target);
        }
        
        return -1;
    }
}
