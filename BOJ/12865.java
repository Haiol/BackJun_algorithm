import java.io.*;
import java.util.*;
public class Main {
    static int max=0;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String z[] = br.readLine().split(" ");
        int s = Integer.valueOf(z[0]),w = Integer.valueOf(z[1]);
        int r[][] = new int[s][2];
        while(0<s--){ z =  br.readLine().split(" ");
            r[s][0]=Integer.valueOf(z[0]);r[s][1]=Integer.valueOf(z[1]);}
        Arrays.sort(r,(a,b)->a[0]-b[0]);
        for(int i=0;i<r.length;i++)result(r,i,w,r[i][0],r[i][1]);
        bw.write(max+"\n");
        bw.flush();
    }
    public static void result(int r[][],int index,int w,int myw,int sum){
        if(max<sum)max=sum;
        for(int i=index;i<r.length;i++){
            if(myw+r[i][0]>w)continue;
            else
            result(r,i,w,myw+r[i][0],sum+r[i][1]);
        }
    }
}


