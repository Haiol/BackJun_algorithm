class Solution {
    public long[] solution(int x, int n) {
            long answer[] = new long[n],i=x;
            for(int s=0;s<n;s++,i+=x)
                answer[s] = i;
            return answer;
        }
}
