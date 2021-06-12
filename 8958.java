import java.io.*;

public class 8958 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int size = Integer.valueOf(br.readLine());
            for(int i=0;i<size;i++){
                bw.write(cntOX(br.readLine())+"\n");
                bw.flush();
            }

        } catch (IOException e) {
        }
    }
    static int cntOX(String str){
        int cnt,result = 0 ;
        String[] arr = str.split("X");
        for(int i=0; i<arr.length;i++){
            cnt=0;
            if(arr[i].length() != 0){
                for(int j=0; j<arr[i].length();j++){
                    result += ++cnt;
                }
            }
        }
        return result;
    }
}
