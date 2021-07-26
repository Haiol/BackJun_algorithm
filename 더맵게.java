
import java.util.*;
class 더맵게 {
  public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.naturalOrder());
        for(int i: scoville)queue.add(i);
        while(!queue.isEmpty() && queue.peek()<K){
            if(queue.size()<2&&queue.peek()<K)return -1;
            queue.add(queue.poll()+queue.poll()*2);
            answer++;
           // System.out.println(queue)

        }

        return answer;
  }
}
