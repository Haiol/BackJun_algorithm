import java.util.Scanner;
class 1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        while(0<size--)
        System.out.println(seq(-1*sc.nextInt()+ sc.nextInt()));
    }
   static int seq(int a){
        int r = a,i = 1,cl=0,cnt = 0;
        do {
            if(r-i>=0){
                r=r-i;
                cnt++;
                if(0<cl++){
                    i++;
                    cl = 0;
                }
            }
            else{
                i--;
            }
        }while (r>0);
        return cnt;
   }
}
