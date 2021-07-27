import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 기능개발 {
    public static void main(String[] args) {
        int []p={93,30,55},s={1, 30,5};
//        int []p={95, 90, 99, 99, 80, 99},s={1, 1, 1, 1, 1, 1};
//        int []p={20, 99, 93, 30, 55, 10},s={5, 10, 1, 1, 30, 5}; // 3, 3
        for(int i:solution(p,s)) System.out.println(i);

        }
    public static int[] solution(int[] progresses, int[] speeds) {
        int r[] = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int p = speeds[i], cnt = 1;
            while (progresses[i] + p < 100) {
                p += speeds[i];
                cnt++;
            }
            r[i] = cnt;
        }
        List<Integer> l = new ArrayList<>();
//        for (int i = 0, cnt = 1; i < r.length; i++) {
//            if (i < r.length - 1 && r[i] >= r[i + 1]) cnt++;
//            else {
//                l.add(cnt);
//                cnt = 1;
//            }
//        }
        for (int i = 0, cnt = 1; i < r.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (r[j] >= r[i] && i != j && !l.isEmpty()) {
                    l.set(l.size() - 1, l.get(l.size() - 1) + 1);
                    break;
                }
                if (j == 0) l.add(1);
            }
        }
//        for(int i=r.length-1,cnt=1;i>=0;i--) {
//            for(int j=i;j>=0;j--){
//                if(r[i]>=r[i] && i!=j && !l.isEmpty()) {
//                    l.set(l.size() - 1, l.get(l.size() - 1) + 1);
//                    break;
//                }
//                if(j == 0)l.add(1);
//            }
//        }
            return l.stream().mapToInt(i -> i).toArray();


    }
}
