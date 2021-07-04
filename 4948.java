import java.util.*;
class 4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a=sc.nextInt(),cnt=0;
            if(a==0)break;
            Boolean p[]= new Boolean[a+a+1];
            Arrays.fill(p,false);
            for(int i=2;i<=a+a;i++) {
                if (i>a && !p[i])cnt++;
                for (int j = i; j <= a+a;j+=i) 
                    p[j] = true;
            }
            System.out.println(cnt);
        }

    }
}
