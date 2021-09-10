import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    final static int S = 9;
    static int map[][];
    static boolean flag = true;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        map = new int[S][S];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < S; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < S; j++) {
                map[i][j] = Integer.valueOf(s.nextToken());
                if (map[i][j] == 0)
                    list.add(new int[]{i, j});
            }
        }
        dfsMap(0, list);
    }

    public static void dfsMap(int depth, ArrayList<int[]> emp) throws IOException {
        if (flag && depth == emp.size()) {
            for (int i[] : map) {
                for (int j : i)
                    bw.write(j + " ");
                bw.write("\n");
            }
            bw.flush();
            flag = false;
        }

        if (flag) {
            int arr[] = emp.get(depth), v = arr[0], h = arr[1];

            for (int n = 1; n <= S; n++) {
                map[v][h] = n;
                if (checkSection(v, h) && checkVH(v, h))
                    dfsMap(depth + 1, emp);
                map[v][h] = 0;
            }
        }

    }

    public static boolean checkVH(int V, int H) {
        int arrV[] = new int[S + 1], arrH[] = new int[S + 1];
        for (int i = 0; i < S; i++) {
            arrV[map[V][i]]++;
            arrH[map[i][H]]++;
            if ((map[V][i] != 0 && arrV[map[V][i]] > 1) || (map[i][H] != 0 && arrH[map[i][H]] > 1))
                return false;
        }
        return true;
    }

    public static boolean checkSection(int V, int H) {
        int arr[] = new int[S + 1];
        int v = V / 3;
        int h = H / 3;
        for (int i = v * 3; i < v * 3 + 3; i++)
            for (int j = h * 3; j < h * 3 + 3; j++) {
                arr[map[i][j]]++;
                if (map[i][j] != 0 && arr[map[i][j]] > 1)
                    return false;
            }
        return true;
    }
}
