import java.util.Stack;

class 짝지여없애기 {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));

    }

    private static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        if(!stack.empty() && stack.peek() == c)stack.pop();
        else
            stack.push(c);
        if(stack.empty()) return 1;
        return 0;
    }


}
