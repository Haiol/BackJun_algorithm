import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        int answer;
        String temp = dartResult.replaceAll( "[^0-9]"," ");
        List<Integer> list = new ArrayList<>();
        for(String s:temp.split(" ")){
            if(!s.equals(""))list.add(Integer.valueOf(s));
        }
        temp = dartResult.replaceAll( "[0-9]"," ");
        int i=0;
        for(String s:temp.split(" ")){
            if(!s.equals("")){
                int t = list.get(i);
                for(char c:s.toCharArray())
                    switch (c){
                    case 'S':t= (int) Math.pow(t,1);break;
                    case 'D':t= (int) Math.pow(t,2);break;
                    case 'T':t= (int) Math.pow(t,3);break;
                    case '#':t*=-1;break;
                    case '*':t*=2;
                    if(i>0)list.set(i-1,list.get(i-1)*2);
                    break;
                    }
                list.set(i,t);
                i++;
            }

        }
//        System.out.println(list);
        answer = list.stream().mapToInt(o -> o).sum();
        return answer;
    }
}
