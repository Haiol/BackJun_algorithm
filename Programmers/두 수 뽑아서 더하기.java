import java.util.HashSet;
class Solution {
  
     public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int l = numbers.length;
        for(int i=0;i<l;i++)
            for(int j=i+1;j<l;j++)set.add(numbers[i]+numbers[j]);
        return set.stream().mapToInt(o->o).sorted().toArray();
    }
}
