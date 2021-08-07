public class Main {

    public static int[] src;
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int s = Integer.valueOf(br.readLine());
        src = new int[s];
        while (0<s--) src[s]=Integer.valueOf(br.readLine());
        tmp = new int[src.length];
        mergeSort(0, src.length-1);
        for(int i:src) bw.write(i+"\n");
        bw.flush();
    }

    public static void mergeSort(int start, int end) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && src[p]<src[q])) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                src[i]=tmp[i];
            }
        }
    }
}
