import java.util.Scanner;
public class 10250{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
       while (0<s--){
            int h = sc.nextInt(),w = sc.nextInt(),n = sc.nextInt();
            System.out.println(n%h==0?h*100+n/h:n%h*100+n/h+1);
        }
    }
}
