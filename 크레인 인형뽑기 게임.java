import java.util.ArrayList;


class 크레인 인형뽑기 게임 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 2, 1, 0, 0},
                {0, 2, 1, 0, 0},
                {0, 2, 1, 0, 0}};
        int[] moves = {1, 2, 3, 3, 2, 3, 1};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int cnt = 0, tmp;
        ArrayList rePopStack = new ArrayList();
        for (int i = 0; i < moves.length; i++) {
            tmp = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][tmp] == 0) continue;
                rePopStack.add(board[j][tmp]);
                board[j][tmp] = 0;
                break;
            }
        }// 뽑기 하는 과정
        if (rePopStack.size() > 0) {
            for (int i = 1; i < rePopStack.size(); i++) {
                while (i>0) {
                    if (rePopStack.get(i - 1) != rePopStack.get(i)) break;
                    rePopStack.remove(i);
                    rePopStack.remove(i - 1);
                    i--;
                    cnt = cnt + 2;
                }
            }
        }
        return cnt;
    }
}
