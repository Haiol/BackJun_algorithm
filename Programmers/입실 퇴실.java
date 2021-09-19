import java.util.ArrayList;

class Solution{
    public static void main(String[] args) {
        int[] n1={1,4,2,3},n2={2,1,4,3};
        solution(n1,n2);
    }

    public static int[] solution(int[] enter, int[] leave) {
        ArrayList<Integer> room  = new ArrayList();
        int meet[] = new int[leave.length];
        int i=0,j=0;
        while (j<leave.length){

            // In
            if(room.size()>0) {
                for (int k : room)
                    meet[k-1]++;
                meet[enter[i]-1] += room.size();
            }
            room.add(enter[i++]);

            while (j<leave.length&&room.contains(leave[j])){
                room.remove((Integer)leave[j++]);
            }

        }
        return meet;
    }
}
