import java.io.*;

public class 11720 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String tmp = br.readLine();
            int size = Integer.valueOf(tmp);
            int result = 0;
            String tmp2 = br.readLine();
            for(int i=0;i<size;i++)
                result+= Integer.valueOf(tmp2.charAt(i)+"");
            bw.write(result+"\n");
            bw.flush();
        } catch (IOException e) {
        }
    }

}
