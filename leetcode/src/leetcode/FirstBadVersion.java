package leetcode;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
        return binarySearchBadVersion(1, n);
    }
    
    private int binarySearchBadVersion(int start, int end){
        if(end>= start){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                if(mid == 1 || !isBadVersion(mid-1)){
                    return mid;
                }
                return binarySearchBadVersion(0, mid-1);
            }
            
            return binarySearchBadVersion(mid+1, end);
        }
        
        return -1;
    }
    
    
    //Dummy Api
    private boolean isBadVersion(int i) {
    	if(i==1) return true;
    	
    	return false;
    }
}
