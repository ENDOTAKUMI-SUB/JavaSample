public class Challenge07 {
    public static void main(String[] args) {
        System.out.print("段数を入力してください >");
        int integer = new java.util.Scanner(System.in).nextInt();

        // 外側
        for (int i = 0; i < integer; i++) {
            // 空白　
            for (int j = 0; j < integer - (i + 1); j++) {
                System.out.print(" ");
            }
            // ピラミッド
            for (int k = 0; k < (i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
