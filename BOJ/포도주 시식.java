import java.util.Scanner;

class Main{
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int map[] = new int[s],dp[]=new int[s+1];
        for(int i=0;i<s;i++)
            map[i] = sc.nextInt();


        dp[1] =map[0];
        if(s==1){
            System.out.println(dp[1]);
            return;
        }
        dp[2] = map[0]+map[1];
        if(s==2){
            System.out.println(dp[2]);
            return;
        }
        for(int i=3;i<=s;i++){
            dp[i] = dp[i-3] + map[i-2]+map[i-1];
            dp[i] = Math.max(dp[i],dp[i-2] +map[i-1]);
            dp[i] = Math.max(dp[i],dp[i-1]);

        }

        System.out.println(dp[s]);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

}
