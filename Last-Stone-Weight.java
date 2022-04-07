class Solution {
    public int lastStoneWeight(int[] stones) {
        int counter = stones.length;
        while (counter > 1){
            int x=0;
            int y = 0;
            int xx = 0;
            int yy =0;
            for(int i = 0;i<stones.length;i++){
                
               if (stones[i] > x){
                y = x;
                yy = xx;
                x = stones[i];
                xx = i;
                }
                else if(stones[i]<=x && stones[i]>y ){
                    y = stones[i];
                    yy = i;
                } 
                
                
                if (i == ((stones.length)-1)){
                    if (x > y){
                        stones[xx] = (x-y);
                        stones[yy] = 0;
                        counter--;
                    }
                    else if(x < y){
                         stones[yy] = (y-x);
                        stones[xx] = 0;
                        counter--;
                    }
                    else if (x==y){
                        stones[xx] = 0;
                        stones[yy] = 0;
                        counter--;
                        counter--;
                    }
                }
            }
            
        }
        int p = 0;
        for (int i = 0;i<stones.length;i++){
            if (stones[i]>0){
                p = stones[i];
            }
        }
        return p;
    }
}
