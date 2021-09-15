import java.util.Scanner;

class Main {
    static int map[];
    public static void main(String[] args) {
        map = new int[1000000001];
        map[0] = 0; map[1] = 0;map[2] = 1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),max=0,idx=0;
        for(int i=a;i<=b;i++) {
            int t = ouBark(i);
            if (max < t) {
                max = t;
                idx = i;
            }
            System.out.println(i+" "+t);
        }
        System.out.println(idx+" "+max);

    }

    public static int ouBark(int i) {
//        System.out.println(i+" f ");
        int t = i;
        if(i==1)
            return 1;
        if (map[t]!=0)
            t =  map[i];
        else {
            if(i%2==0)
                t=i/2;
            else
                t=3*i+1;
            map[i] = t;
        }
        System.out.println(t);
        return 1+ouBark(t);
    }
}
