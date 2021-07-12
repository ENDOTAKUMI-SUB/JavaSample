public class Exam3_3_1 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください >");
        int integralValue = new java.util.Scanner(System.in).nextInt();
        if (integralValue % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

    }
}
