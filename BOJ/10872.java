class 10872{ public static void main(String[] args) {
        System.out.println(r(new java.util.Scanner(System.in).nextInt(),1));
    }static int r(int a,int b){
        if(a==0)return b;b*=a;return r(a-1,b);
    }
}
