import java.util.PriorityQueue;

class Solution {
    static PriorityQueue<Integer> q = new PriorityQueue<>();
    public static void main(String[] args) {
    int s[][] = {{1,0,1,1,1}
              , {1,0,1,0,1}
               ,{1,0,1,1,1}
               ,{1,1,1,0,1}
               ,{0,0,0,0,1}
    };
        System.out.println(solution(s));
    }
    public static int solution(int[][] maps) {
        int answer = 0;
        makeMyLoot(maps,0,0,1);
        System.out.println(q);
        return q.peek();
    }
    public static void makeMyLoot(int[][] maps,int x,int y,int depth){
        maps[x][y] = -1;
        int x_max= maps.length-1;
        int y_max = maps[0].length-1;
        if(x== x_max && y==y_max){q.add(depth);
            System.out.println(q.size());}
        if(y<y_max && maps[x][y+1] == 1)
            makeMyLoot(maps,x,y+1,depth+1);
        if(x<x_max &&maps[x+1][y] == 1)
            makeMyLoot(maps,x+1,y,depth+1);
        if(y>0 && maps[x][y-1] == 1) //
            makeMyLoot(maps,x,y-1,depth+1);
        if(x>0 && maps[x-1][y] == 1) //
            makeMyLoot(maps,x-1,y,depth+1);
        maps[x][y] = 1;
        return;
    }

}
