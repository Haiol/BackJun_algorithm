import java.io.*;

public class 10951 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (true) {
                int result=0;
                String s = br.readLine();
                String[] arr = s.split(" ");
                for(int i=0;i< arr.length;i++)
                    result+=Integer.valueOf(arr[i]);
                bw.write(result+ "\n");
                bw.flush();
            }
        }catch (Exception e){
        }
    }
}
