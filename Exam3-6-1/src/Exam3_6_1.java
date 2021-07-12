public class Exam3_6_1 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください >");
        int x = new java.util.Scanner(System.in).nextInt();
        int ans = 1;
        for (int i = 1; i <= x; ++i) {
            ans = ans * i;
        }
        System.out.println(x + "! = " + ans);
    }
}
