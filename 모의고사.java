class 모의고사 {
    public static int[] solution(int[] answers) {
        int s1[] = {1, 2, 3, 4, 5}, s1_L = s1.length;
        int s2[] = {2, 1, 2, 3, 2, 4, 2, 5}, s2_L = s2.length;
        int s3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}, s3_L = s3.length;
        int s[] = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if (s1[i % s1_L] == answers[i]) s[0]++;
            if (s2[i % s2_L] == answers[i]) s[1]++;
            if (s3[i % s3_L] == answers[i]) s[2]++;
        }
        int max=0,m_s=0;
        for(int i: s)if(i>max)max = i;
        for(int i: s)if(i==max)m_s++;
        if(m_s == 0)return null;
        int r[] = new int[m_s],t=0;
        for(int i = 0;i< 3;i++)if(s[i]==max)r[t++]=i+1;
        return r;
    }
}
