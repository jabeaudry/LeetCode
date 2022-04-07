//
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = {0,0};
        for (int i = 0; i<nums.length;i++){
            for (int j = 1+i;j<nums.length;j++){
                if ((nums[i]+nums[j])==target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if (arr[1]!=0){
                break;
            }
        }
        return arr;
    }
}


//the following code was found on: https://www.code-recipe.com/post/two-sum
//this solution has a time complexity of O(n), which constitutes a much better performance than two nested for loops.

// public class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
//         for(int i = 0; i < numbers.length; i++){
//             Integer requiredNum = (Integer)(target - numbers[i]);
//             if(indexMap.containsKey(requiredNum)){
//                 int toReturn[] = {indexMap.get(requiredNum), i};
//                 return toReturn;
//             }

//             indexMap.put(numbers[i], i);
//         }
//         return null;
//     }
// }
