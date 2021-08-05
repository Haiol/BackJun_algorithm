import java.io.*;

public class 2675 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String tmp = br.readLine();
            int size =Integer.valueOf(tmp);
            for(int i=0;i<size;i++)
                bw.write(temper(br.readLine())+"\n");
            bw.flush();
        } catch (IOException e) {
        }
    }
    static String temper(String str){
        String result="";
        String [] arr=str.split(" ");
        for(int j=0;j<arr[1].length();j++){
            for(int i=0;i < Integer.valueOf(arr[0]);i++)
                result= result + arr[1].charAt(j)+"";
        }
        return result;
    }
}
