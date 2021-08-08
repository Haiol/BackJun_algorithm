import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(), i=0;
        String arr[][] = new String[size][2];
        while (  i<size){ arr[i][0] = sc.next();arr[i++][1] = sc.next();};
        Arrays.sort(arr,(o1, o2) -> { return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);});
        for(String s[] : arr) System.out.println(s[0]+" "+s[1]);
    }
}

