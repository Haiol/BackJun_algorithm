import java.io.*;

class Main{
    static Integer arr[][];
    public static void main(String[] args) throws IOException {
        arr = new Integer[41][2];
        arr[0][0]=1;
        arr[0][1]=0;
        arr[1][0]=0;
        arr[1][1]=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.valueOf(br.readLine());
        while (0<s--){
            int t = Integer.valueOf(br.readLine());
            fibonacci(t);
            bw.write(arr[t][0]+" "+arr[t][1]+"\n");
        }
        bw.flush();
    }

    public static Integer[] fibonacci(int n) {
      // N에 대한 0, 1의 호출 횟수가 없을 때(탐색하지 않은 값일 때)
        if(arr[n][0] == null || arr[n][1]== null){
            arr[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            arr[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return arr[n];
    }


}
