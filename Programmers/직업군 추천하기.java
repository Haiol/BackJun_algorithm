import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public HashMap<String,Integer> g;
    public void setting(){
        g = new HashMap<>();
        g.put("JAVA",0);
        g.put("JAVASCRIPT",1);
        g.put("C",2);
        g.put("C++",3);
        g.put("C#",4);
        g.put("SQL",5);
        g.put("PYTHON",6);
        g.put("KOTLIN",7);
        g.put("PHP",8);
    }
    public String solution(String[] table, String[] languages, int[] preference) {
        setting();
        int map[][] = new int[9][5],max_n=0;
        String max_g="",t;
        for(int i=0;i<5;i++){
            int j=5,sum=0;
            StringTokenizer tz = new StringTokenizer(table[i]);
            g.put(t=tz.nextToken(),i);
            while (tz.hasMoreTokens()){
               map[g.get(tz.nextToken())][i]=j--;
            }
            for(j=0;j<languages.length;j++){
                sum+=map[g.get(languages[j])][i]*preference[j];
            }
            if(max_n<sum){
                max_n =sum;
                max_g = t;
            }else if(max_n==sum)
                max_g = max_g.compareTo(t)<1?max_g:t;
        }

        return max_g;
    }

    public static void main(String[] args) {
        String z[] = new String[]{"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String h[] = new String[]{"JAVA", "JAVASCRIPT"};
        int b[] = new int[]{7, 5};
        Solution solution = new Solution();
        System.out.println(solution.solution(z,h,b));
    }
}
