import java.util.Scanner;

class Main{
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(),money[] = new int[s],coin=0;
        int total = sc.nextInt();
        for(int i=0;i<s;i++)
            money[i] = sc.nextInt();
        for(int i = s-1;i>=0;i--)
            if(money[i]<=total){
                coin += total/money[i];
                total %= money[i];
            }
        System.out.println(coin);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

}
