//
//public class Main {
//    public static void main(String[] args) {
//        int s[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        System.out.println(solution(s,"right"));
//
//    }
//    public static String solution(int[] numbers, String hand) {
//        String answer = "";
//        int leftHand[] ={3,1};
//        int rightHand[] = {3,1};
//        for(int i: numbers){
//            if(i == 1 || i == 4 || i == 7){
//                answer+="L";
//                fingerLocation(leftHand, i);
//            }else if(i == 3 || i == 6 || i == 9) {
//                answer+="R";
//                fingerLocation(leftHand, i);
//            }else{
//                answer+="R";
//            }
//        }
//        return answer;
//    }
//    public static void fingerLocation(int hand[],int num){
//        if(num == 0){
//            hand[0] = 3;
//            hand[1] = 2;
//        }else{
//            hand[0] = num%3==0?num/3-1:num/3;
//            if(hand[1] == 2 ||hand[1] == 5 ||hand[1] == 8 || hand[1] == 0)
//                hand[1] = 2;
//        }
//    }
//
//
//}
///////////////////////////////////// Beta
class 키패드입력하기{
    public static void main(String[] args) {
        int s[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution(s,"right"));


    }
    public static String  solution(int[] numbers, String hand) {
        String answer = "";
        int left= -1, right = -1,l=0,r=0;
        for(int i : numbers){
            if(i == 1 || i == 4 || i == 7){
                answer+= "L";
                left=i;
            }else if(i == 3 || i == 6 || i == 9){
                answer += "R";
                right = i;
            }else{
               l = Math.abs(getFloor(left)-getFloor(i));
                 r = Math.abs(getFloor(right)-getFloor(i));
                if(l==r) {
                    answer += hand.equals("left") ? "L" : "R";
                    if(hand.equals(left))left=i;else right = i;
                }else{
                    answer +=l<r? "R":"L";
                    if (l<r)right=i;else left = i;
                }
            }
            System.out.println(l+"  "+r+ " "+answer);
        }

        return answer;
    }
    public static int getFloor(int num){
        if(num == 0 || num ==-1)return 3;
        return num%3==0?num/3-1:num/3;
    }
}
