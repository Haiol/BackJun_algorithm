import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 4673 {
    public static void main(String[] args) throws IOException {
        int size=10001;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String []D_arr= new String[size];
        for(int i=0; i<size;i++)
            D_arr[i]=i+"";
        for(int i=0; i<size;i++){
            int num = Integer.valueOf(d(i+""));
            if(num<size)
                D_arr[num]="";
        }
        for(int i=0; i<size;i++){
            if(D_arr[i].length()>0)
                bw.write(D_arr[i]+"\n");
        }
        bw.flush();
    }
    static String d(String a){
        int result= Integer.valueOf(a);
        String[] arr=a.split("");
        for(int i=0;i<arr.length;i++)
            result+=Integer.valueOf(arr[i]);
        return String.valueOf(result);
    }
}
