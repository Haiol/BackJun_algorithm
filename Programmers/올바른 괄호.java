import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> map = new Stack<>();
        for(char c:s.toCharArray())
            if(c==')'){
                if(!map.isEmpty() && map.peek() =='(')
                    map.pop();
                else return false;
            }
            else
                map.add(c);
        return map.size()==0?true:false;
    }
}
