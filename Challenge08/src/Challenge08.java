public class Challenge08 {
    public static void main(String[] args) {
        System.out.print("いくつまでの素数を出力しますか >");
        int integer = new java.util.Scanner(System.in).nextInt();
        int n, i;
        for (n = 2; n <= integer; n++) {
            for (i = n / 2; n % i != 0; i--) ;
            if (i == 1) System.out.print(n + ",");
        }
    }
}
