  class Solution {
    public int solution(int[][] sizes) {
        int x=0,y=0;
        for(int i[] : sizes)
        {
            int min = Math.min(i[0],i[1]);
            int max = Math.max(i[0],i[1]);
            if(x<max)x =max;
            if(y<min)y =min;
        }
        return x*y;
    }
}
