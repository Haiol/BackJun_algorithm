import java.io.*;

public class 11654 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String tmp = br.readLine();

            bw.write((int)tmp.charAt(0)+"\n");
            bw.flush();

        } catch (IOException e) {
        }
    }

}
