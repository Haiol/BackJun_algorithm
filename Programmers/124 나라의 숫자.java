import java.util.*;
class Solution {
    
    public static String solution(int n) {

       StringBuilder sb = new StringBuilder();
        int temp = 0;

        while(true){
            if(n%3==0){
                n--;
              temp = n%3+1;
            }
            else temp =(n%3);
            sb.append(nara124(temp) );
            if(n/3==0)break;
            n/=3;
        }



        return sb.reverse().toString();
    }
    public static int nara124(int n){
        if(n==3)return 4;
        return n;
    }
    
    
    
//     public static String solution(int n) {
//         String answer = "";
//         int temp = 0;
//          List<Integer> s = new ArrayList<>();
//         while(true){
//             if(n%3==0){
//                 n--;
//                 s.add(n%3+1);
//             }
//             else s.add(n%3);
//             if(n/3==0)break;
//             n/=3;
//         }
//           for(int i:s){
//             if(i==3)answer = 4+ answer ;
//             else answer = i + answer;
//         }

//         return answer;
//     }
}
