import java.util.Arrays;

class Solution {
    public String solution(String number, int k) {
       String answer = "";
        for (int j = 0, index = -1; j < number.length() - k; j++) {
            char max = 0;
            for (int i = index + 1; i <= k + j; i++) {
                if (max < number.charAt(i)) {
                    index = i;
                    max = number.charAt(i);
                }
            }
            answer += max;
        }
        return answer;
    }

}
