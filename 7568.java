import java.io.*;
import java.util.Scanner;

class 7568{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int s = sc.nextInt(),p=0;
        int r[][] = new int[s][2];
        while (s>p++) {
            r[p-1][0] = sc.nextInt();r[p-1][1] = sc.nextInt();
        }
        for(int i=0;i<r.length;i++){
            int cnt=1;
            for(int j=0;j<r.length;j++){
                if(i==j)continue;
                if(r[i][0]<r[j][0] && r[i][1]<r[j][1])cnt++;
            }
            bw.write(cnt+" ");
        }
        bw.flush();
    }
}
