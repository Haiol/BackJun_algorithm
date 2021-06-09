import java.io.*;

public class 2562 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int pivot =0;
            int[] arr = new int[9];
            for(int i=0;i<9;i++)
                arr[i]=Integer.parseInt(br.readLine());
            int max=arr[0];
            for(int i=1;i< arr.length; i++){
                if(arr[i]>max) {
                    max = arr[i];
                    pivot=i;
                }
            }
            bw.write(max+"\n");
            bw.write((pivot+1)+"\n");
            bw.flush();
        }catch (IOException e){
        }
    }
}
