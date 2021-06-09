import java.io.*;

public class 10952 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (true) {
                String s = br.readLine();
                String[] arr = s.split(" ");
                int a, b;
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
                if(a+b ==0)break;
                bw.write((a + b) + "\n");

                bw.flush();
            }
        }catch (IOException e){

        }

    }
}
