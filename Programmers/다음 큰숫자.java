class Solution {
    public int solution(int n) {
        int p=getOneCount(n);
        for(int i=n+1;;i++){
            if(getOneCount(i)==p){
                return i;
            }
        }
    }
    public int getOneCount(int n){
        int cnt=0;
        char arr[] = Integer.toBinaryString(n).toCharArray();
        for(char c:arr)
            if(c=='1')cnt++;
        return cnt;
    }
}
