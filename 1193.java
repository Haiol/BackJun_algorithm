public class 1193{
    public static void main(String[] args) {
        int s = new java.util.Scanner(System.in).nextInt();
        for(int i=0,c=0;c<s;i++) for(int j=i-1,q=1;q<i;j--,q++,c++) if(c==s-1)
                    System.out.println(i%2==0?j+"/"+q:q+"/"+j);
    }
}
