import java.io.*;

public class 10818 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String b = br.readLine();
            int m_lth = Integer.parseInt(b);
            String s = br.readLine();
            String[] arr = s.split(" ");
            int max=Integer.parseInt(arr[0]);
            int min=Integer.parseInt(arr[0]);
            for(int i=1;i< m_lth; i++){
                if(Integer.parseInt(arr[i])>max)
                    max = Integer.parseInt(arr[i]);
                if(Integer.parseInt(arr[i])<min)
                    min = Integer.parseInt(arr[i]);
            }
            bw.write(min+" "+max+"\n");
            bw.flush();

        }catch (IOException e){
        }
    }
}
