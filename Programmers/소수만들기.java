class 소수만들기{
    public static void main(String[] args) {
       int []p ={1,2,3,4};
        System.out.println(solution(p));

    }
    public static int solution(int[] nums) {
        int answer=0;
       for(int i=0;i<nums.length-2;i++)
           for(int j=i+1;j<nums.length-1;j++)
               for (int q=j+1;q<nums.length;q++)
                   if(primeNumber(nums[i]+nums[j]+nums[q])) answer++;
       return answer;
    }
    public static boolean primeNumber(int num){
        if(num==1)return false;
        for(int i=2;i<num;i++)if(num%i==0)return false;
        return true;
    }
}
