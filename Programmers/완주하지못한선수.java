import java.util.HashMap;

class 완주하지못한선수{
    public static void main(String[] args) {
        String a[] = {"stanko", "ana", "mislav"};
        String b[] = {"mislav", "stanko", "mislav", "ana"};
        System.out.println(solution(a,b));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for(String i : participant){
            if(map.get(i)==null)
                map.put(i,1);
            else{
                int v = map.get(i)+1;
                map.put(i,v);
            }
        }
        for (String i : completion)
            if(map.get(i)!=null)map.put(i,map.get(i)-1);
        System.out.println(map);
        for(String key : map.keySet()){

            if(map.get(key) == 1 || map.get(key) ==-1)answer=key;
        }

        return answer;
    }

}
