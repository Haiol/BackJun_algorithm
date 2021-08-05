import java.io.*;

public class 2439 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s = br.readLine();
            for (int i = 0; i < Integer.valueOf(s); i++) {
                for (int j = Integer.valueOf(s)-2;j>=i; j--) {
                    bw.write(" ");
                }
                for (int j = 0;j<=i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
        }catch (IOException e){

        }

    }
}
