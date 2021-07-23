import java.util.Arrays;
class 체육복 {
    public static void main(String[] args) {
        int[] lost={2,3,4},reserve={1,2,3};
        System.out.println(solution(5,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n-lost.length;
        for (int i=0;i<reserve.length;i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = 0;
                    lost[j] = 0;
                }
            }
        }
        for (int i=0;i<reserve.length;i++){
            for(int j=0;j<lost.length;j++){
                if(reserve[i]==0 || lost[j]==0)continue;
                if(Math.abs(reserve[i]-lost[j])<=1){
                    answer++;
                    reserve[i]=0;
                    lost[j]=0;
                    break;
                }
            }
        }
        return answer;
    }
}
