import java.util.Scanner;

class Main {
    static int map[],memo[][],s=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        map = new int[s];
        memo = new int[s][2];
        for(int i=0;i<s;i++)
            map[i] = sc.nextInt();

        memo[0][1] = map[0];
        memo[0][0] = map[0];
        memo[1][0] = map[1];
        upStair(1);

    }

    public static void upStair(int depth){
        if(depth<s){
            memo[depth][1] = Math.max(memo[depth][1],memo[depth-1][0]+map[depth]);
            if(depth>1)
            memo[depth][0] = Math.max( memo[depth][0],Math.max(memo[depth-2][0],memo[depth-2][1])+map[depth]);
            upStair(depth+1);
        }
        else
            System.out.println(Math.max(memo[s-1][0],memo[s-1][1]));

    }
}

