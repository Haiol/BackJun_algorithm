import java.util.LinkedList;
import java.util.Queue;

class Solution {
   public static int solution(int[][] maps) {
        int x_max = maps.length - 1;
        int y_max = maps[0].length - 1;
        int depth = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        while (!q.isEmpty()) {
            int[] node = q.poll();
            if (node[1] < y_max && maps[node[0]][node[1] + 1] == 1) {
                q.add(new int[]{node[0], node[1] + 1});
                maps[node[0]][node[1]+1] =  maps[node[0]][node[1]] -1;
            }
            if (node[0] < x_max && maps[node[0] + 1][node[1]] == 1) {
                q.add(new int[]{node[0] + 1, node[1]});
                maps[node[0]+1][node[1]] =  maps[node[0]][node[1]] -1;
            }
            if (node[1] > 0 && maps[node[0]][node[1] - 1] == 1) {
                q.add(new int[]{node[0], node[1] - 1});
                maps[node[0]][node[1]-1] =  maps[node[0]][node[1]] -1;
            }
            if (node[0] > 0 && maps[node[0] - 1][node[1]] == 1) {
                q.add(new int[]{node[0] - 1, node[1]});
                maps[node[0]-1][node[1]] =  maps[node[0]][node[1]] -1;
            }
            if (node[0]==x_max && y_max == node[1]) return  (maps[node[0]][node[1]]-2)*-1;
        }
        return -1;
   }
}
