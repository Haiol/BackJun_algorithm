class 1427{
    public static void main(String[] args){
        String n[] = new java.util.Scanner(System.in).nextLine().split("");
        java.util.Arrays.sort(n, java.util.Comparator.reverseOrder());for(String s:n) System.out.print(s);
    }
}
