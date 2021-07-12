public class Exam2_6_4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        System.out.print("a の値を入力してください >");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.print("b の値を入力してください > ");
        b = new java.util.Scanner(System.in).nextInt();
        System.out.println("★ 入れ替え前 ★");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // a と b の入れ替え処理
        c = a;
        a = b;
        b = c;

        System.out.println("★ 入れ替え後 ★");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
