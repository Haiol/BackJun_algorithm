class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1;i<arr.length;i++){
            answer = LCM(answer, arr[i]);
        }
        return answer;
    }
    public int LCM(int a,int b){
        return (a *b) / GCD(a,b);
    }
    public int GCD(int a,int b){
        while(true){
            int r = a%b;
            if(r==0) return b;
            a = b;
            b = r;
        }
    }
}
