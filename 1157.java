import java.io.*;

public class 1157 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String tmp = br.readLine();
            bw.write(Sxt(tmp));
            bw.flush();
        } catch (IOException e) {
        }
    }
    static String Sxt(String tmp){
        String []arr = tmp.toUpperCase().split("");
        String []result = {" ","0"};
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(" ")){
                int cnt=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].equals(arr[j])){
                        arr[j]=" ";
                        cnt++;
                    }
                }
                if(Integer.valueOf(result[1])<cnt){
                    result[0]=arr[i];
                    result[1]=cnt+"";
                }
                    else if(Integer.valueOf(result[1])==cnt)
                        result[0]="?";
            }
        }
        return result[0];
    }
}
