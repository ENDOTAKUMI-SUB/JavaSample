public class Challenge09 {
    public static void main(String[] args) {
        System.out.print("段数を入力してください >");
        int integer = new java.util.Scanner(System.in).nextInt();

        // データ初期化
        int bin[]  = new int[16];
        int n = 0;

        // 2より小さくなるまで2で割っていく
        // その時のあまりをbin[n]に代入
        while (integer >= 2) {
            bin[n] = integer % 2;
            n++;
            integer = integer / 2;
        }
        bin[n] = integer;
        n++;
        // 逆順に出力
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}
