class Solution {
    static int memo[];
    public int solution(int n) {
        memo = new int[100001];
       memo[0] = 0;
       memo[1] = 1;
        memo[2] = 1;
        return fibonacci(n);
    }
    public int fibonacci(int n){
        if(memo[n]!=0)
            return memo[n];
        else
            return memo[n]=(fibonacci(n-1)+fibonacci(n-2))%1234567;
    }
}
