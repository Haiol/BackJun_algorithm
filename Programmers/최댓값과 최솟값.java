import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String a[] = s.split(" ");
           Arrays.sort(a, (o1,o2)->Integer.valueOf(o1)-Integer.valueOf(o2));
        return a[0]+" "+a[a.length-1];
    }
}
