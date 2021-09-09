class Main
{
    static int map[], s, cnt;
    public static void main(String[] args) {
        s= new java.util.Scanner(System.in).nextInt();
        map = new int[s];
        dfs(0);
        System.out.println(cnt);
    }
    public static void dfs(int depth){
        if(depth==s)
            cnt++;
        else {
            for (int i = 0; i < s; i++) {
                map[depth] = i;
                if (isPromising(depth)) {
                    dfs(depth + 1);
                }
            }
        }
    }
    public static boolean isPromising(int w){
        for (int i = 0; i < w; i++)
            if (map[w] == map[i] || w - i == Math.abs(map[w] - map[i])) {
                return false;
            }
        return true;
    }
}
