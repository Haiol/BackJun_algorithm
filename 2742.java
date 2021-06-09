import java.io.*;

public class 2742 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.valueOf(br.readLine());
    for(int i=num;i>=1;i--)
        bw.write(i+"\n");
    bw.flush();
    }

}
