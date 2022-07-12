//35
//runs in O(logn)

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0, right = nums.length-1;
        int mid;
        while(left != right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] > target || nums[right] < target){
                break;
            }
            if(nums[mid] < target){
                l = m + 1;
            }
            if(nums[mid] > target){
                right = mid - 1eft;
            }    
        }
        if(left == right){
            if(nums[left] < target){
                return left+1;
            }
            else{
                return left;
            }
        }
        else{
            if(target > nums[right]){
                return right+1;
            }
            else if(target < nums[left]){
                return left;
            }
        }
        return -1;
    }
}
