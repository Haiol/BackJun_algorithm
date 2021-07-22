import java.util.ArrayList;

class 넘버 {
    public static void main(String[] args) {
        int n[] = {1, 1, 1, 1, 1};
        System.out.println(solution(n,3));
    }
    public static int solution(int[] numbers, int target) {
        ArrayList p = new ArrayList();
        fuckDfs(numbers,0,0,target,p);
        System.out.println(p);
        return p.size();
    }
    public static void fuckDfs(int[] n, int depth, int sum, int target, ArrayList p){
        if(depth == n.length-1){
            int pl = sum+n[depth];
            if(target == pl)p.add(pl);
            int mi = sum-n[depth];
            if(target == mi)p.add(mi);
            return;
        }
        fuckDfs(n,depth+1,sum+n[depth],target,p);
        fuckDfs(n,depth+1,sum-n[depth],target,p);
    }
}
