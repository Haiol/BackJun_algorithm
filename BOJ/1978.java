import java.util.Scanner;
class 1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(),result=0;
        while(0<s--)
            if(result(sc.nextInt())) result++;
        System.out.println(result);
    }
    static boolean result(int a){
        if(a==1) return false;
        for(int i=2;i<a;i++)
            if(a%i==0)return false;
        return true;
    }
}
