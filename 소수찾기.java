import java.util.*;

class Solution {
   public static int solution(String numbers) {
        HashSet<Integer> c = new HashSet<>();
        String r[] =numbers.split("");
        boolean visit[] = new boolean[r.length];
        for (int i=0;i<r.length;i++) {
            makeNumber(r, i, visit, "", c);
        }
        System.out.println(c);
        return c.size();
    }
    public static void makeNumber(String r[],int v,boolean visit[],String t,HashSet c){
        visit[v] = true;
        t+=r[v];
    
        if(primeNumber(Integer.valueOf(t)))
            c.add(Integer.valueOf(t));

        for(int i=0;i<r.length;i++)
            if(visit[i] == false)
                makeNumber(r,i,visit,t, c);
        visit[v] = false;

    }

    public static boolean primeNumber(int num){
        if(num == 0||num==1)return false;
        for(int i=2;i*i<=num;i++)
            if(num%i==0)return false;
        return true;
    }
}
