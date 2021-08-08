
import java.util.*;

public class Main {
    static int a[][];
    static int tmp[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        a = new int[s][2];
        tmp = new int[s][2];
        while (0<s--){
            a[s][0]= sc.nextInt();
            a[s][1]= sc.nextInt();
        }
        mergeSort(0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i][0]+  " "+ a[i][1]);
    }
    public static void mergeSort(int start, int end){
        if(start<end){
            int mid=(start+end) /2 ;
            mergeSort(start,mid);
            mergeSort(mid+1,end);

            int p= start;
            int q= mid+1;
            int idx = p;

            while (p<=mid || q<=end){
                if(q>end || (p<= mid && a[p][0] <a[q][0]) || (p<= mid && a[p][0] ==a[q][0]&& a[p][1] <=a[q][1])){
                    tmp[idx++] = a[p++];
                }else{
                    tmp[idx++] = a[q++];
                }
            }
            for(int i=start;i<=end;i++){
                a[i] = tmp[i];
            }
        }
    }

}

