class Solution {
    public long solution(int price, int money, int count) {
        long t=0;
       while(0<count--)t+=price*(count+1);
        
        if(t - money<=0)return 0;
        else return t-money;
    }
}
