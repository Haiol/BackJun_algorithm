import java.util.Stack;

class Main{
    public static void main(String[] args) {
        char[] arr = (new java.util.Scanner(System.in).nextLine()+"-").toCharArray();
        Stack<Integer> st = new Stack<>();
        String temp = "";
        char t = '-';
        for(char c:arr){
            if('0'<=c && c<='9'){
                temp=temp+c;
            }
            else {
                if(t=='+')
                    st.push(st.pop()+Integer.valueOf(temp));
                if(t=='-')
                    st.push(Integer.valueOf(temp));

                temp="";
                t = c;
            }
        }
//        System.out.println(st);
        int sum = st.get(0);
        for(int i=1;i<st.size();i++)
            sum-=st.get(i);
        System.out.println(sum);

    }
}
