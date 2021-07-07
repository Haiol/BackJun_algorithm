import java.util.Arrays;

class star{
    static String [][]r;
    public static void main(String[] args) {
       int a = new java.util.Scanner(System.in).nextInt();
       r = new String[a][a];
       for(int i=0;i<a;i++)
        Arrays.fill(r[i],"*");
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++) {
                if(re(i,j))r[i][j]=" ";
                System.out.print(r[i][j]);
            }
            System.out.println();
        }
    }

    static boolean re(int x,int y){
        if (((x % 3) == 1) && ((y % 3) == 1)) return true;
        if(x == 0 || y == 0) return false;
        return re(x/3,y/3);
    }


}
