import java.io.*;

public class 4344 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int size = Integer.valueOf(br.readLine());
            for(int i=0;i<size;i++){
                bw.write(checkScore(br.readLine())+"%\n");
                bw.flush();
            }

        } catch (IOException e) {
        }
    }
    static String checkScore(String str){
        int cnt=0,sum = 0,node=0 ;
        String[] arr = str.split(" ");
        int size = Integer.valueOf(arr[0]);
        for(int i=1; i<size+1;i++){
            sum+=Integer.valueOf(arr[i]);
        }
        node = sum/size;
        for(int i=1; i<size+1;i++){
            if(Integer.valueOf(arr[i])>node)
                cnt++;
        }
        return String.format("%.3f",cnt/(size*0.01));
    }
}
