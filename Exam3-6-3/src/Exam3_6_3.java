public class Exam3_6_3 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください >");
        int integer = new java.util.Scanner(System.in).nextInt();

        if (integer < 2) {
            System.out.println("2以上の整数を入力してください");
            return;
        }

        for (int i = 2; i < integer; i++) {
            if (integer % i == 0) {
                System.out.println(integer + "は素数ではありません");
                return;
            }
        }

        System.out.println(integer + "は素数です");
    }
}
