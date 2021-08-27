  public static String convertion(int num, int notation){
        String res = "";
        int mok = num;
        int nmg = 0;

        while(mok >= notation){
            nmg = mok % notation;
            mok /= notation;

            // 10진법보다 크고 나머지가 10 이상인 경우
            if(notation > 10 && nmg >= 10){
                res = (char)(nmg+55) + res;
            }else{
                res = nmg + res;
            }
        }

        if(notation > 10 && mok >= 10){
            res = (char)(mok+55) + res;
        }else{
            res = mok + res;
        }

        return res;
    }
