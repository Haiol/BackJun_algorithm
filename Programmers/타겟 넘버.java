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
/*
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}
*/
