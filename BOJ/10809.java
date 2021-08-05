import java.io.*;

public class 10809 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String tmp = br.readLine();
            int size =tmp.length();
            String[] arr = new String[26];
            String[] arr2 = tmp.split("");
            for(int i=size-1; i>=0; i--){
                if(!(arr2[i].equals(""))){
                    String temp = (int)arr2[i].toUpperCase().charAt(0)+"";
                    arr[Integer.parseInt(temp)-65] = i+"";
                }
            }
            for (String b: arr) {
                if (b != null)
                bw.write(b+" ");
                else{
                    bw.write(-1+" ");
                }
            }
            bw.flush();
        } catch (IOException e) {
        }
    }

}
