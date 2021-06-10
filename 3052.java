import java.io.*;

public class 3052 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] arr = new int[10];
            for(int i=0;i<10;i++)
                arr[i]=Integer.parseInt(br.readLine());
            int[] result = new int[10];
            for (int i=0;i<10;i++) {
                result[i] = arr[i]%42;
            }
            int cnt=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<=i;j++){
                    if(i!= j) {
                        if (result[i]==result[j]) {
                            cnt--;
                            break;
                        }
                    }
                }
                cnt++;
            }
            bw.write(cnt+"\n");
            bw.flush();
        }catch (IOException e){
        }
    }
}
