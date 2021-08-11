import java.util.Arrays;
class Solution {
    public  String solution(int[] numbers) {
        String answer = "";
        String arr[] = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arr,(o1, o2) -> (o2+o1).compareTo(o1+o2));
        for (String i:arr) answer+=i;
        return answer;
    }
}
