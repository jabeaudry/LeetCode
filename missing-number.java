//268
class Solution {
    public int missingNumber(int[] nums) {
        int expected = 0;
        int actualTotal = 0;
            for (int i = 0; i < nums.length;i++){
                expected += (i + 1);
                actualTotal +=  nums[i];
            }
            return (expected - actualTotal);
        }
    
}
