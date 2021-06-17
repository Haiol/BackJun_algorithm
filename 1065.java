import java.io.*;

public class 1065 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int result=0;
            int size = Integer.valueOf(br.readLine());
            for(int i=1;i<=size;i++){
                if(hansu(String.valueOf(i))){
                    result++;
                }
            }
            bw.write(result+"\n");
            bw.flush();

        } catch (IOException e) {
        }
    }
    static boolean hansu(String str){
        String [] arr = str.split("");
        if(arr.length>2){
            for(int i=1; i<arr.length-1;i++){
                int a = Integer.valueOf(arr[i-1]);
                int b = Integer.valueOf(arr[i]);
                int c = Integer.valueOf(arr[i+1]);
            if(a-b!=b-c)
                return false;
            }
        }
        return true;
    }
}
