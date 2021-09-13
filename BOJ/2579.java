import java.util.Scanner;

class Main{
    static int stair[],r[][],s=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        if(s==1) System.out.println(sc.nextInt());
        else {
            stair = new int[s];
            r = new int[s][2];
            for (int i = 0; i < s; i++)
                stair[i] = sc.nextInt();
            r[0][0] = stair[0];
            r[1][0] = stair[1];
            upStair(0);
            System.out.println(Math.max(r[s - 1][0], r[s - 1][1]));
        }

    }
    public static void upStair(int location){
        if (location < s-1) {
            r[location + 1][1] = Math.max(r[location + 1][1], r[location][0] + stair[location+1]);
            if (location + 2 < s)
                r[location + 2][0] = Math.max(r[location + 2][0], Math.max(r[location][0],r[location][1]) + stair[location + 2]);
            upStair(location + 1);
        }
    }
}
