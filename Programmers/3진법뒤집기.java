import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> s = new ArrayList<>();
        while (n>0){
            s.add(n%3);
            n/=3;
        }
        int answer = 0;
        for(int i=0,j=s.size()-1;i<s.size();i++,j--)
            answer+=s.get(i)*Math.pow(3,j);
        return answer;
    }
}
