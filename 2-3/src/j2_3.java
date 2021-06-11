public class j2_3 {
    public static void main(String[] args) {
        /* ユーザから入力を受け付ける */
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();

        /* 変換 */
        int age = Integer.parseInt(ageString);  // ageString を int 型に変換して age に代入

        /* 占う */
        int fortune = new java.util.Random().nextInt(4) + 1;    // 1~4の乱数を生成

        /* 結果を出力する */
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" +
                fortune + "です");
        System.out.println("1：大吉　2：中吉　3：吉　4：凶");

    }
}
