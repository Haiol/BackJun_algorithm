public class 2908 {
    public static void main(String[] args)  {
       String []arr =  new StringBuffer(new java.util.Scanner(System.in).nextLine()).reverse().toString().split(" ");
        System.out.println(Integer.valueOf(arr[0])>Integer.valueOf(arr[1])? arr[0]:arr[1]);
    }

}
