import java.io.*;
import java.util.StringTokenizer;

class 1018{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
       int x=Integer.valueOf(s.nextToken()),xt=x,y=Integer.valueOf(s.nextToken()),t=64;
       String r[][] = new String[x][y];
        while (0<xt--)r[xt]=br.readLine().split("");
        for(int i=0;i<=x-8;i++){;
            for(int j=0;j<=y-8;j++){
                System.out.println(i+j+"번째");
              int o=re(i,j,r);
              if(t>o)
                  t=o;
            }
        }
        System.out.println(t);
    }
    static int re(int x,int y,String r[][]) {
        int cnt = 0;
        for (int i = 0,t=0; i < 8; i++,t=0) {
            for(int j=0; j < 8; j++)
                if(r[i+x][j+y].equals("W")) t++;
                cnt=cnt+Math.abs(t-4);
        }
            return cnt;
    }
}
