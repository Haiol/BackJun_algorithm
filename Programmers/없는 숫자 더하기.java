class Solution {
    public int solution(int[] numbers) {
        boolean n[] = new boolean[10];
        int answer = 0;
        for(int i:numbers)
            n[i] = true;
        for(int i=0;i<10;i++)
            if(!n[i])answer+=i;
        return answer;
    }
}
