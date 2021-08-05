class 2231{
    public static void main(String[] args) {
        int s = new java.util.Scanner(System.in).nextInt();
        int t = s,r=0;
        while (0 < t--) {
            if(re(t,s))
                r=t;
        }
        System.out.println(r);
    }
    static boolean re(int s,int r){
        String k[] = (s+"").split("");
        int sum =0;
        for(String z:k)sum+=Integer.valueOf(z);
        if(r==sum+s)return true;
        else return false;
    }
}
