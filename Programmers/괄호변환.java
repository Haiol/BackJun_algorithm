class Solution {
    public String solution(String p) {
        if(p.equals(""))return  "";
        return bracket(p);
    }
    public String bracket(String p){
        if(p.equals(""))return"";
        String u,v,w = p,t="";
        int node = sub(w);
        u =  w.substring(0,node);
        v = w.substring(node);
        if(verify(u))
            return u+bracket(v);
        else
        {

            t="(";
            t+=bracket(v);
            t+=")";
            u=u.substring(1,u.length()-1);
            u=swapParent(u);
            return t+u;
        }

    }

    public int sub(String w){
        int l=0,r=0,n=0;
        for (char t:w.toCharArray()){
            n++;
            if(t == '(')l++;
            if(t == ')')r++;
            if(l == r) break;
        }
        return n;
    }
    public boolean verify(String w){
        int l=0,r=0;
        for (char t:w.toCharArray()){
            if(t == '(')l++;
            if(t == ')')r++;
            if(l < r) return false;
        }
        return true;
    }
    public String swapParent(String s){
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(s.length());
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case ')': sb.append('('); break;
                case '(': sb.append(')'); break;
                default: sb.append(c);
            }
        }
        return sb.toString();
    }
//
//    public static void main(String[] args) {
//        System.out.println(new Solution().solution("()))((()")); // ()))((()
//    }
}
