import java.io.BufferedWriter;
import java.util.Scanner;

class Main{
    static int map[][];
    static int r[][];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        map = new int[s][3];
        r = new int[10000][3];
        int a=0,b=0,c=0,i=0;

        while (i<s){
            for (int j=0;j<3;j++)
                map[i][j] = sc.nextInt();
            i++;
        }

        r[0][0] = map[0][0];
        r[0][1] = map[0][1];
        r[0][2] = map[0][2];

        for(i=1;i<s;i++){
            for(int j=0;j<s;j++){
                if(j==0)
                    r[i][j]=map[i][j]+Math.min(r[i-1][1],r[i-1][2]);
                if(j==1)
                    r[i][j]=map[i][j]+Math.min(r[i-1][0],r[i-1][2]);
                if(j==2)
                    r[i][j]=map[i][j]+Math.min(r[i-1][1],r[i-1][0]);
            }
        }

        System.out.println(Math.min(Math.min( r[s-1][0], r[s-1][1]), r[s-1][2]));


    }

}
