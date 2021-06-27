import java.util.Scanner;
public class 2775{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
       while (0<s--){
            int a = sc.nextInt(),b = sc.nextInt(),r=0;
           System.out.println(result(a,b,r));
        }
    }
    static int result(int k,int n,int r){
        if(k==1)
            for(int i=1;i<n+1;i++)
                r += i;
            else
            for(int i=1;i<n+1;i++)
                r += result(k-1,i,0);
        return r;
    }
}
