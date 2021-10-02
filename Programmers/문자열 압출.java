import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String s) {
        if(s.length()<=1)return s.length();
        int answer = Integer.MAX_VALUE;
        for(int i=1;i<s.length()/2+1;i++){
            int t = getPartitionSize(i,s);
            if(answer>t)answer = t;
        }
        return answer;
    }
    public int getPartitionSize(int i,String s){
        Queue<String> map = new LinkedList<>();
        int l= 0;
        String tmp = "",result="";
        while (l<s.length()){
            if(l+i>s.length())break;

            tmp = s.substring(l,l=l+i);
            if(map.contains(tmp)) map.add("1");
            else{
                if(map.size()>0)
                result+=(map.size()==1?"":map.size())+map.peek();

                map.clear();
                map.add(tmp);
            }
        }
        result+=(map.size()==1?"":map.size())+map.peek();
        result += s.substring(l);

       return result.length();
    }

}
