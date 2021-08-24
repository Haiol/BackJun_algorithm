class Solution {
    public int[] solution(int[] arr) {
        if(arr.length<2)return new int[]{-1};
        int answer[] = new int[arr.length-1],j=0;
        int Min = Integer.MAX_VALUE;
        for(int i: arr)if(Min>i)Min=i;
        for(int i:arr)if(i!=Min)answer[j++]=i;
        return answer;
    }
}
