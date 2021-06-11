public class Exam2_6_2 {
    public static void main(String[] args) {
        System.out.print("整数1を入力してください　＞");
        int comparison1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("整数2を入力してください　＞");
        int comparison2 = new java.util.Scanner(System.in).nextInt();
        System.out.println(Math.max(comparison1, comparison2) + "の方が大きいです");
    }
}
