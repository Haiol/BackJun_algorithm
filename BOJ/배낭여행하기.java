import java.util.Arrays;
import java.util.Scanner;

class Main{
    static int map[][];
    static boolean visit[] ;
    static int board[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(),k = sc.nextInt();
        map = new int[s][2];
        board = new int[k+1];
        visit = new boolean[s];

        while (0<s--){
            map[s][0]  =sc.nextInt();
            map[s][1]  =sc.nextInt();
        }

        Arrays.sort(map,(o1, o2) -> o2[1]-o1[1]);
//        for(int z[]:board)
//            System.out.println(Arrays.toString(z));
        r(k,0,0);
        System.out.println(Arrays.stream(board).max().getAsInt());

    }
    static void r(int k,int l,int sum){
        for(int i=0;i<map.length;i++){
            if(!visit[i] && map[i][0]+l<=k){
                visit[i]=true;
                int tmp = l+map[i][0];
                int tmp2 = sum+map[i][1];
                if(board[tmp] <tmp2) {
                    board[tmp] = tmp2;
                    r(k, tmp, tmp2);
                }
                visit[i]=false;
            }
        }

    }


}
