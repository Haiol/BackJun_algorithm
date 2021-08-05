import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt(),w = sc.nextInt(),h = sc.nextInt(),temp=Integer.MAX_VALUE;
        int arr[] ={Math.abs(w-x),Math.abs(h-y),x,y};
        for(int a: arr)
            if(temp>=a){
                temp = a;
            }
        System.out.println(temp);
    }
}
