import java.util.Scanner;
public class 2839{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(result(s,s/5));

    }
    static int result(int r,int p){
        int z=r -p*5;
        if(p<0) return -1;
        if(z%3==0) return z/3+p;
        return result(r,p-1);
    }
}
