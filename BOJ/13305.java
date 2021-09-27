import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt()-1;
        BigInteger map[][] = new BigInteger[s][2], sum =new BigInteger("0");
        for(int i=0;i<s;i++){
            map[i][0] = new BigInteger(sc.nextInt()+"");

        }
        for(int i=0;i<s;i++){
            map[i][1] = new BigInteger(sc.nextInt()+"");
            if(i>0 && map[i-1][1].compareTo(map[i][1]) == -1)map[i][1] = map[i-1][1];
            sum = sum.add(map[i][1].multiply(map[i][0]));
        }
        sc.nextInt();
//        for(int i[]:map)
//            System.out.println(Arrays.toString(i));

        System.out.println(sum);
    }
}
