public class Challenge02 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください >");
        int integralValue = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= integralValue; i++){
            if ( i % 5 == 0  ) {
                System.out.print(i + " ");
            }
        }
    }
}
