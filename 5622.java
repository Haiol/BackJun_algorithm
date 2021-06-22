public class 5622 {
    public static void main(String[] args)  {
        int result = 0;
      String [] arr = new java.util.Scanner(System.in).nextLine().split("");
      for(int i=0;i<arr.length;i++)
          result+= dial(arr[i].charAt(0));
        System.out.println(result);
    }
    static int dial(int p){
        int [] arr = {3,3,3,3,3,4,3,4};
        int once = 0;
        for(int i=65,j=0,cnt = 0;i<91;i++,j++,cnt++){
            if(arr[once] == cnt){
                cnt = 0;
                once++;
            }
            if(p== i){
                break;
            }
        }
        return once+3;
    }
}
