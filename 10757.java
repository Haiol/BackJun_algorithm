class 10757{
    public static void main(String[] args){
       String str[] = new java.util.Scanner(System.in).nextLine().split(" ");
        String a = str[0];
        String b = str[1];
        StringBuilder sb = new StringBuilder(result(a,b)).reverse();
        System.out.println(sb);
    }
    static String result(String a,String b){
        String result = "";
        int size_a = a.length()-1;
        int size_b = b.length()-1;
        int temp = 0;
        while (size_a>=0 || size_b >=0){
            int an = size_a<0?0:Integer.valueOf(""+a.charAt(size_a));
            int bn = size_b<0?0:Integer.valueOf(""+b.charAt(size_b));
            int re = temp+an+bn;
            if(re/10>0)
                temp = re/10;
            else
                temp = 0;
            result += re%10;
            if(size_a<=0 && size_b <=0 && re/10>0) result += temp;
            size_a--;size_b--;
        }

      return  result;
    }
}
