import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int i:arr){
            if(i!=temp)list.add(i);
            temp=i;
        }
        return  list.stream().mapToInt(Integer::intValue).toArray();
    }
}
