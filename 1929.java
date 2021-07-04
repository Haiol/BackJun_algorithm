import java.util.*;
class 1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        Boolean p[]= new Boolean[b+1];
        Arrays.fill(p,true);p[0] = false;p[1] = false;
        for(int i=2;(i*i)<=b;i++) if(p[i]) for(int j=i*i;j<=b;j=j+i) p[j]=false;
        for(int i=a;i<=b;i++) if(p[i]) System.out.println(i);
    }
}
