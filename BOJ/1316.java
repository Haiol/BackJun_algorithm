import java.io.*;

public class 1316{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int result =0,size = Integer.valueOf(br.readLine());
    for(int i=0;i<size;i++)
        result += chekGroup(br.readLine());
       bw.write(result+"\n");
       bw.flush();
    }

    static int chekGroup(String p){//97~ 122
        Boolean arr[] = new Boolean[26];
        int result = 1;
        for(int i=0;i<p.length();i++){
            if(arr[p.charAt(i)-97]!=null){
                if(p.charAt(i-1)==p.charAt(i))
                    continue;
                else{
                    result = 0;
                    break;
                }
            }else{
                arr[p.charAt(i)-97]=true;
            }
        }
        return result;
    }
}
