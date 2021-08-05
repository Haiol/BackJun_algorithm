class 신규 아이디 추천{
    public static void main(String[] args) {
        String s = "=.=";
        System.out.println(solution(s));
    }
    public static String solution(String new_id) {
        String answer = new_id;
        answer = answer.toLowerCase();// 1단계
     /*   65 90 up
        97 122 low
        48 57 num
        45 -  46 .
        95 _*/
        for(int i=0;i<answer.length();i++){// 2단계
            char t = answer.charAt(i);
            if(!((97<= t && t <= 122) || (48<=t && t<=57) || t==45 ||t==46 ||t == 95))
                answer = answer.replace(answer.charAt(i), ' ');

        }
        answer = answer.replace(" ",""); // 공백제거
        answer = checkDoubleComa(answer);//3단계
        if(answer.charAt(0)=='.')answer =answer.substring(1);//4단계
        if(answer.length()!=0&& answer.charAt(answer.length()-1)==46)answer =answer.substring(0,answer.length()-1);
        if(answer.length() == 0)answer = "a";
        if(answer.length()>15){//5단계
            answer = answer.substring(0,15);
            answer = solution(answer);
        }
        if(answer.length()<=2)for(int i = answer.length(); i<=2;i++)//6단계
            answer+=answer.charAt(answer.length()-1);


        return answer;
    }
    public static String checkDoubleComa(String str){
        char s[] = str.toCharArray();
        for(int i=0;i<s.length-1;i++)
            if(s[i]==46 && s[i+1]==46)s[i]=' ';
        return String.valueOf(s).replace(" ","");
    }
}
