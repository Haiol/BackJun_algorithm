import java.util.Arrays;
import java.util.Scanner;

class Main{
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int map[][] = new int[s][2];
        for(int i=0;i<s;i++) {
            map[i][0] = sc.nextInt();
            map[i][1] = sc.nextInt();
        }
        Arrays.sort(map,(a,b)->{
            if(a[0] != b[0])
                return a[0]-b[0];
            else
                return a[1]-b[1];
        });
        for(int i[]:map){
            System.out.println(i[0] + " "+ i[1]);
        }
        System.out.println();
        int p = 0,p_x=0,cnt=0;
        for(int i=0;i<s;i++){
            int x =map[i][0],y=map[i][1];
            if(x>=p){//next
                cnt++;
                p = y;
                System.out.println(map[i][0] + " "+ map[i][1]);
            }else{
                //reduce
                if (p > y) p = y;

                //modify 1.row width
            }

        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        new Main().solution();
    }
}
