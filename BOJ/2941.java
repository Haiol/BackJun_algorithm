public class 2941 {
    public static void main(String[] args) {
        String [] rd = new java.util.Scanner(System.in).nextLine().split("");
        int cnt=0;
        for(int i=0; i<rd.length; i++){
            if(rd[i].equals("=")){
                if(i>0){
                    if(i>1)
                        if (rd[i-2].equals("d") && rd[i-1].equals("z"))cnt++;
                    if(rd[i-1].equals("c"))cnt++;
                    if(rd[i-1].equals("s"))cnt++;
                    if(rd[i-1].equals("z"))cnt++;

                }

            }else if(rd[i].equals("-")){
                if (i > 0) {
                    if(rd[i-1].equals("c"))cnt++;
                    if(rd[i-1].equals("d"))cnt++;

                }
            }else if(rd[i].equals("j")){
               if(i>0){
                   if(rd[i-1].equals("n"))cnt++;
                   if(rd[i-1].equals("l"))cnt++;
               }
            }
        }
        System.out.println(rd.length-cnt);
    }
}
