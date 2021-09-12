import java.util.Scanner;

class Main{
    static int map[][];
    static int r[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        map = new int[s][s];
        r = new int[s+1][s+1];
        int max = 0, i = 0;

        while (i < s) {
            for (int j = 0; j < i+1; j++)
                map[i][j] = sc.nextInt();
            i++;
        }


        r[0][0] = map[0][0];
        tree(0,0);

        for(int n[]:r)
            for (int z:n)
                if(max<z)max=z;

        System.out.println(max);

    }
    public static void tree(int depth,int leaf){
        if(depth<leaf){
            depth++;
            leaf=0;
        }
        if (depth<map.length-1 && leaf < map.length-1) {
            r[depth+1][leaf] = Math.max(r[depth+1][leaf],map[depth+1][leaf]+ r[depth][leaf]) ;
            r[depth+1][leaf+1] = Math.max(r[depth+1][leaf+1],map[depth+1][leaf+1]+ r[depth][leaf]) ;
            tree(depth,leaf+1);
        }else{

        }

    }
}
