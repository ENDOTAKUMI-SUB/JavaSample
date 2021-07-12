public class Challenge05 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください >");
        int integer = new java.util.Scanner(System.in).nextInt();
        String str = String.valueOf(integer);
        StringBuilder strb = new StringBuilder(str);
        System.out.println(strb.reverse().toString());
    }
}