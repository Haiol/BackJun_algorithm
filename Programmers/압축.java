import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
    for(int s:solution("AAAAAA")){
        System.out.println(s);
    }
    }
    public static int[] solution(String msg) {
        HashMap<String,Integer> map= new HashMap();
        int p=26; //  this is map's value is starting point
        for(int i='A', q=1;i<'Z';i++,q++) map.put(Character.toString(i),q); //A - Z map init
        ArrayList<Integer> answer = new ArrayList<>();
        while (msg.length()>0){
            int i=findLenW(map,1,msg);
            String w=msg.substring(0,i),c=msg.length()>i?msg.substring(i,i+1):"";

            answer.add(map.get(w));
            map.put(w+c,++p);

//            System.out.println(w+" "+ c+" "+msg.length());



            msg = msg.substring(i);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
   public static int findLenW(HashMap map,int depth, String s){
        if(s.length()<depth)return 0;
        String tmp = s.substring(0,depth);
        if(map.containsKey(tmp)){
            return 1+findLenW(map,depth+1,s);
        }
        else return 0;
   }
}
