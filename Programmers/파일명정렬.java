import java.util.Arrays;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        mFile[] map = new mFile[files.length];
        for(int i=0;i<files.length;i++){
            map[i] = new mFile(files[i]);
        }
        Arrays.sort(map,(a,b)->{
            if(a.getHead().equals(b.getHead())){
                return a.getNum()-b.getNum();
            }else return a.getHead().compareTo(b.getHead());
        });
        for(int i=0;i<files.length;i++) {
            answer[i] = map[i].filename;
        }
        return answer;
    }
    class mFile{
        private String filename="",num="",head="",tail="";
        mFile(String str){
            filename = str;
            int i=0;
            for(char c:str.toCharArray()){
                if(i==0&&'0'<=c&&c<='9')i++;
                else if(i==1&&!('0'<=c&&c<='9'))i++;
                switch (i){
                    case 0:head+=Character.toString(c);break;
                    case 1:num+=c-48;break;
                    default:tail+=Character.toString(c);break;
                }
            }
        }
        public String getHead(){return head.toUpperCase();}
        public int getNum(){return Integer.valueOf(num);};
    }
}
