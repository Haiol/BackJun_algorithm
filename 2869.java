import java.io.*;
public class 2869{
    public static void main(String[] args) throws IOException {
        String arr[] = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int a= Integer.valueOf(arr[0]),b=Integer.valueOf(arr[1]),v=Integer.valueOf(arr[2]),r=(v-a)/(a-b);
        System.out.println((a-b)*r+a>=v?r+1:r+2);
    }
}
