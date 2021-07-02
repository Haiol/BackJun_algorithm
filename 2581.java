import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b= sc.nextInt(),sum =0,l=0;
    for(int i=a;i<=b;i++)
        if(prime(i)){
            if(sum<=0)
                l=i;
            sum=sum+i;
        }
    if(sum>0){
        System.out.println(sum);
        System.out.println(l);
    }else
        System.out.println("-1");

    }
    static boolean prime(int a){
        if(a==1)return false;
        for(int i=2;i<a;i++)
            if(a%i==0)return false;
            return true;
    }
}
