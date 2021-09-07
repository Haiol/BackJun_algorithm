import java.io.*;

class Main{
    static int map[];
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n=Integer.valueOf(s[0]),m=Integer.valueOf(s[1]);
        map = new int[m];
        dfs(n,m,0,0);
        bw.flush();
    }
    public static void dfs(int n,int m,int f,int depth) throws IOException {
        if(depth==m){
            for(int i:map)
                bw.write(i+" ");
            bw.write("\n");
            return;
        }
        for(int i=f;i<n;i++){
            map[depth]=i+1;
            dfs(n,m,i,depth+1);
        }
    }
}
