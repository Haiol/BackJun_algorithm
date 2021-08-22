class Solution {
    public static void main(String[] args) {
        System.out.println(solution("3people Unfollowed Me"));
    }
    public static String solution(String s) {
        String answer = "";
        int cnt=1;
        for(char c:s.toCharArray()){
            if(c == ' ')cnt = 0;
            if(cnt==1 && 97 <=c && c<=122){
                System.out.println(c);
                answer+=Character.toString(c-32);
            }
            else if(cnt!=1 && 65 <=c && c<=90)
                answer+=Character.toString(c+32);
            else
                answer+=Character.toString(c);
            cnt ++;

        }
        return answer;
    }
}
