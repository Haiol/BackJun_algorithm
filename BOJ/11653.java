
class 11653{
    public static void main(String[] args) {
        int a = new java.util.Scanner(System.in).nextInt();
        int r=a;
        while(true){
            if(r == 1)break;
            for(int i=2;i<=r;i++)
                if(r%i==0){
                   r=r/i;
                    System.out.println(i);
                   break;
                }
        }
    }
}
