import java.util.*;

class 9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while (0 < s--) {
            int a = sc.nextInt();
            Boolean p[] = new Boolean[a];
            Arrays.fill(p, false);
            p[0]=true;
            p[1]=true;
            for (int i = 2; i < a; i++) {
                for (int j = i+i; j < a; j += i)
                    p[j] = true;
            }
            int k = a/2, temp = 0;
            while (0<k) {
                if (!p[k]) {
                    if (!p[a - k]){
                        System.out.println(k + " " +(a - k));
                        break;
                    }
                }
                k--;
            }
        }

    }
}
