// #26
// remove duplicates in an array without extra storage

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 1){
            return 1;
        }
        else {
            int counter = 0;
            int current = nums[0];
            for (int i = 0; i < nums.length;i++){
                if (i == 0){
                    counter++;
                }
                else if (current != nums[i]){
                    nums[counter] = nums[i];
                    current = nums[i];
                    counter++;
                }
            }
            return counter;
        }
        
    }
}
