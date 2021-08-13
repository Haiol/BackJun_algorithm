class Solution {
     public static String solution(int[][] scores) {
        String answer = "";
        int s = scores.length,temp = 0,sum=0,min=101,max = 0,cnt=0;
        double r=0;
        for(int i=0;i<s;i++){
            sum =0;
           max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            cnt = s-1;
            for(int j=0;j<s;j++){
                if(i==j)temp = scores[j][i];
                else{
                    sum+= scores[j][i];
                    if(scores[j][i]<min)min =scores[j][i];
                    if(scores[j][i]>max)max =scores[j][i];
                }
            }
            if(min<= temp && temp <= max){
                sum+= temp;
                cnt ++;
            }
            r = 1.0*sum/cnt;

           if(r>=90)
               answer+="A";
           else if(r>=80)
               answer+="B";
           else if(r>=70)
               answer+="C";
           else if(r>=50)
               answer+="D";
           else
               answer+="F";
        }
        return answer;
    }
}
