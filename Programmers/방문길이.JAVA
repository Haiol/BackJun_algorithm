import java.util.ArrayList;

class Solution {
    public int solution(String dirs) {
        ArrayList<String> line = new ArrayList<>();
                int x=0,y=0;

        for(String s:dirs.split("")){
            String now = x+""+y;
            if(y<5&&s.equals("U"))y++;
            if(-5<y&&s.equals("D"))y--;
            if(x<5&&s.equals("R"))x++;
            if(-5<x&&s.equals("L"))x--;

            if(!line.contains(now+x+""+y)&& !line.contains(x+""+y+now)
                    &&!now.equals(x+""+y))line.add(now+x+""+y);
        }
        return line.size();
    }
}
