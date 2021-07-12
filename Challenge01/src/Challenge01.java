import java.util.Collections;

public class Challenge01 {
    public static void main(String[] args) {
        System.out.print("文字列を入力してください");
        String text = new java.util.Scanner(System.in).nextLine();
        System.out.println(repeat("*", text.length()));
    }

    /**
     *  repeat[同じ文字列を繰り返す]
     * @param str　文字列
     * @param n　繰り返す回数
     * @return 繰り返された文字列
     */
    public static String repeat(String str, int n) {
        return String.join("", Collections.nCopies(n, str));
    }
}
