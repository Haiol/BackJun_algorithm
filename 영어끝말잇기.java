import java.util.Stack;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int r=1,t=1;

        Stack<String> map = new Stack<>();
        map.add(words[0]);
        for(int i=1;i<words.length;i++){
            t++;
            if(t>n){
                t=1;
                r++;
            }
            if(!map.contains(words[i]) && getLast(map.peek()).equals(getFirst(words[i])))
                map.add(words[i]);
            else return new int[]{t,r};

        }

        return answer;
    }
    public String getFirst(String s){
        return s.substring(0,1);
    }
    public String getLast(String s){
        int i = s.length();
        return s.substring(i-1,i);
    }
}
