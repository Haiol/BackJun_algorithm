public class 키패드입력하기 {
    public static void main(String[] args) {
        int s[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution(s,"right"));


    }
    static String solution(int[] numbers, String hand) {
        String answer = "";
        int le = -1, ri = -1,ld,rd; // # , * = -1 대체
        boolean flag; // true  = leftHand  false  = rightHand
        for(int i: numbers){

            if(i == 1 || i == 4 || i == 7)flag = true;
            else if(i == 3 || i == 6 || i == 9 )flag = false;
            else{
                ld = Math.abs(getX(le) - getX(i)) + Math.abs(getY(le) - getY(i));
                rd = Math.abs(getX(ri) - getX(i)) + Math.abs(getY(ri) - getY(i));
                if(ld == rd)flag= hand.equals("left")?true:false;
                else if(ld<rd)flag = true;
                else flag = false;
            }
            if(flag){
                answer +="L";
                le = i;
            }else{
                answer += "R";
                ri = i; }
        }
        return answer;
    }
    public static int getX(int n){
        if(n == 2 || n == 5 || n == 8 || n == 0)return 2;
        return 1;
    }
    public static int getY(int n){
        if(n == -1 || n == 0)return 3;
        return n%3==0?n/3-1:n/3;
    }
}
