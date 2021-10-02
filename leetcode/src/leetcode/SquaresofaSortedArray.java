package leetcode;

public class SquaresofaSortedArray {
	public int[] sortedSquares(int[] nums) {
        int[] squareNums = new int[nums.length];
        
        int startIndex = 0;
        int endIndex = nums.length -1;
        for(int i = nums.length-1; i >= 0; i--){
            int startSquare = nums[startIndex] * nums[startIndex];
            int endSquare = nums[endIndex] * nums[endIndex];
            if(endSquare > startSquare){
                squareNums[i] = endSquare;
                endIndex--;
            } else {
                squareNums[i] = startSquare;
                startIndex++;
            }
        }
        
        return squareNums;
    }
}
