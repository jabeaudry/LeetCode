//69
class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long mid;
        if (x==0){
            return 0;
        }
        if (x == 1){
            return 1;
        }
        if (x==2){
            return 1;
        }
        if (x==3){
            return 1;
        }
        while (start != end){
          mid = (start+end)/2;
            if (mid*mid <= x && ((mid+1)*(mid+1))>x){
                return (int)mid;
            }
            if (mid*mid < x){
                start = mid;
            }
            else if (mid*mid > x){
                end = mid;
                
            }
        }
        return -1;
    }
}
