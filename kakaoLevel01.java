
class kakaoLevel01{
    static String[] num ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(re(s));

    }
    static int re(String s){
        for(int i=0;i<10;i++){
           if(s.contains(num[i]))
               s=s.replace(num[i],i+"");
        }
        return Integer.valueOf(s);
    }
}
