import java.io.*;

public class 10871 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s = br.readLine();
            String[] arr = s.split(" ");
            int a,b;
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            s = br.readLine();
            arr = s.split(" ");
            for (int i = 0; i < a; i++) {
                if(Integer.parseInt(arr[i])<b)
                    bw.write(Integer.parseInt(arr[i])+" ");
            }
            bw.write("\n");
            bw.flush();
        }catch (IOException e){

        }

    }
}
