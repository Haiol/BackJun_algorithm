import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        HashSet<String> st = new HashSet<>();

        while (0 < s--) st.add(sc.next());
        String[] arr = new String[st.size()];
        st.toArray(arr);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int l = o1.length();
                    for (int i = 0; i < l; i++) {
                        if(o1.charAt(i) != o2.charAt(i))
                            return o1.charAt(i) - o2.charAt(i);
                    }
                }
                return o1.length() - o2.length();
            }
        });
        for (String p : arr) System.out.println(p);
    }
}

