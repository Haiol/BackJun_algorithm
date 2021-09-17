import java.util.Scanner;

class Main{
    static int S=0,cnt =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        upStair(0, 0);
        System.out.println(cnt);
//        for(int i=1;i<20;i++) {
//            S = i;
//            upStair(0, 0);
//            System.out.println(cnt);
//        }


    }
    public static void upStair(int sum,int debuff){
        debuff--;
        if(sum == S)
            cnt++;
        else if(sum<S){
            upStair(sum+1,debuff);
            upStair(sum+2,debuff);
            if(debuff<=0)
                upStair(sum+3,3);

        }


    }
}
