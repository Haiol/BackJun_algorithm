class Solution {
 public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];


        for(int i=0;i<arr1.length;i++){ // A 세로길이
            for(int j=0;j<answer[0].length;j++){ // A 가로길이
                for(int q=0;q<arr2.length;q++){ // B 세로
                    answer[i][j]+=arr1[i][q]*arr2[q][j];
                }
            }
        }
        return answer;
    }
}
