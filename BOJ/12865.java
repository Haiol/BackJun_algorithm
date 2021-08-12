import java.util.*;
public class Main {
    static int max=0;

    public static void doCombination(int[][]r, int re, int index,int limit, int sum){


//        System.out.println(r[index][0]+" "+r[index][1]+" "+re+" "+ sum+" "+max);
        if(index==limit)return;
        sum+=r[index][1];
        if(re >=0){
            if(max<sum) max = sum;
        }
        else return ;
//        System.out.println(re+"  "+sum);
        doCombination(r,re-r[index][0],index,limit,sum);
        doCombination(r,re-r[index][0],index+1,limit,sum);
        doCombination(r,re,index+1,limit,0);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int r[][] = new int[n][2];
        while (0<n--){r[n][0]= sc.nextInt();r[n][1]=sc.nextInt();}
        Arrays.sort(r,(o1,o2)->o1[1]-o2[1]);
        doCombination(r,k,0,r.length-1,0);

        System.out.println(max);
    }
}

