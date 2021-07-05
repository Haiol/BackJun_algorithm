import java.util.*;

class 4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a= sc.nextInt(),b= sc.nextInt(),c= sc.nextInt(),m = 0,p=0;
            p=a*a+b*b+c*c;
            if(c<1)break;
            m = Math.max(a,Math.max(b,c));
            p=p-m*m;
            System.out.println(m*m==p?"right":"wrong");
        }
    }
}
