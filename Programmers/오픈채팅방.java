import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        HashMap<String,String> named = new HashMap<>();
        ArrayList<String> map = new ArrayList<>();
        StringTokenizer tk;
        for(String s:record) {
            tk = new StringTokenizer(s);
            String st = tk.nextToken();
            String id = tk.nextToken();

            if(st.equals("Leave"))
                map.add(id+" -");
            else{
                String nick = tk.nextToken();

                if(st.equals("Enter")){
                    named.put(id,nick);
                    map.add(id+" +");
                }
                else if(st.equals("Change"))named.put(id,nick);
            }
        }

        answer = new String[map.size()];
        for(int i=0;i<map.size();i++){
            tk = new StringTokenizer(map.get(i));
            answer[i] = named.get(tk.nextToken())+"님이 "+(tk.nextToken().equals("+")?"들어왔습니다.":"나갔습니다.");
        }
        return answer;
    }
}
