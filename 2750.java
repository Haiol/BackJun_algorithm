import java.util.*;
class 2750{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int s= sc.nextInt(),n[] = new int[s];
      while (0<s--)n[s]=sc.nextInt();Arrays.sort(n);
      for(int i=0;i<n.length;i++) System.out.println(n[i]);
    }
}
