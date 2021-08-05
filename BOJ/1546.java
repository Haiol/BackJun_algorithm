import java.io.*;

public class 1546 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int size = Integer.parseInt(br.readLine());
            String[] arr;
            String s = br.readLine();
            arr = s.split(" ");
            int max = Integer.valueOf(arr[0]);
            Double sum = 0.0;
            for (int i = 1; i < size; i++) {
                if (Integer.valueOf(arr[i]) > max)
                    max = Integer.valueOf(arr[i]);
            }
            for (int i = 0; i < size; i++) {
                    sum +=(Double.valueOf(arr[i]) / max * 100);
            }
            bw.write(sum/size + "\n");
            bw.flush();
        } catch (IOException e) {
        }
    }
}
