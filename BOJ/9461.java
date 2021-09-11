import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Main{
   static  long map[];
    public static void main(String[] args) throws IOException {
       map = new long [200];
       map[0]=1;
       map[1]=1;
       map[2]=1;
        map[3]=2;
        map[4]=2;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while (0<s--){
            int n = sc.nextInt();
            tile(n);
            bw.write(map[n-1]+"\n");
            bw.flush();
        }



    }
    public static void tile(int n){
       for(int i=5;i<=n;i++){
           map[i] = map[i-1] + map[i-5];
       }
    }
}
