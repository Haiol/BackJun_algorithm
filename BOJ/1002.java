import java.util.Scanner;
class 1002{
    public static void main(String[] args) {
       // 아니 수포자한테 두 원의 위치관계, 두 점의 거리를 계산하라는걸 어렵게 말하냐!!!
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       while (0<s--){
           int c=0;
           int x1=sc.nextInt(),y1=sc.nextInt(),r1=sc.nextInt();
           int x2=sc.nextInt(),y2=sc.nextInt(),r2=sc.nextInt();
           int dd = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
           int rrp = (r1+r2)*(r1+r2);
           int rrm = (r1-r2)*(r1-r2);
           if(dd !=0){
               if(rrp == dd || rrm == dd)c=1;
               else if(rrp> dd && dd>rrm)c=2;
           }
           else
               if(r1 == r2)c=-1;
           System.out.println(c);
       }
    }
}
