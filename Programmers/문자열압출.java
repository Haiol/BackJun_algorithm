class Solution {
    public int solution(String s) {
        int answer = 0, l = 0, t = 0;
        String temp = "", comp = "";
        for (int i = 1; i < s.length(); i++) {

            l = 0;
            temp = "";
            while (l < s.length()) {
                if (l < s.length() - i) {
                    comp = s.substring(l, l + i);
                    t = l + i;
                    if (t <= s.length() -i && comp.equals(s.substring(t, t + i))) {
                        int cnt = 1;
                        while (t < s.length()  && comp.equals(s.substring(t, t+i))) {
                            t = t + i;
                            cnt++;
                        }
                        temp += cnt + comp;
                        l = t;
                        continue;
                    }

                }
                temp += s.substring(l, ++l);
            }
            System.out.println(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("xababcdcdababcdcd");
    }
}
