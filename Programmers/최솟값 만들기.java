 public static int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
       Arrays.setAll(B, i -> ~ B[i]);
       Arrays.sort(B);
        Arrays.setAll(B, i -> ~ B[i]);
        for(int i=0;i<A.length;i++) answer+=A[i]*B[i];

        return answer;
    }
