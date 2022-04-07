//I attempted to solve the palindrome case with stacks, as follows:
//this code runs in O(n), but it requires additional memory (ex: 2 linked lists)
import java.lang.Math;
class Solution {
    
    public boolean isPalindrome(int x) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        LinkedList<Integer> stack2 = new LinkedList<Integer>();
        int counter = 0;
        if (x < 0){
            return false;
        }
        while (x > 0){
           stack.push( x % 10 );
           x = x / 10; 
        }
        if (stack.size()%2 == 0){
            while (stack.size()!=stack2.size()){
                stack2.push(stack.pop());
            }
        }
        else if ((stack.size()%2 == 1)){
            while (stack.size()!=(stack2.size()+1)){
                stack2.push(stack.pop());
            }
            stack.pop();
        }
        boolean pal = true;
        while(!stack.isEmpty()){
            if (stack.pop()!=stack2.pop()){
                pal = false;
            }
        }
        return pal;
        
    }
}


//this solution was found on: https://www.code-recipe.com/post/palindrome-number
// class Solution {
//     public boolean isPalindrome(int x) {
//         // If x is a negative number it is not a palindrome
//         // If x % 10 = 0, in order for it to be a palindrome the first digit should also be 0
//         if (x < 0 || (x != 0 && x % 10 == 0))
//             return false;
//         int res = 0;
//         while (x > res) {
//             res = res * 10 + x % 10;
//             x = x / 10;
//         }
//         // If x is equal to reversed number then it is a palindrome
//         // If x has odd number of digits, dicard the middle digit before comparing with x
//         // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
//         // So, reversedNum/10 = 23, which is equal to x
//         return (x == res || x == res / 10);
//     }
// }


