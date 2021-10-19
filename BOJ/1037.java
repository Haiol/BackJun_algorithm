import java.io.*;
import java.util.Scanner;


class Main{
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int min=Integer.MAX_VALUE ,max = 0;
        while (0<s--){
            int t = sc.nextInt();
            min=Math.min(min,t);
            max=Math.max(max,t);
        }
        System.out.println(min*max);
    }


    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
