public class Challenge03 {
    public static void main(String[] args) {
        // 初期化
        double sum = 0;
        int[] integralValue = new int[3];

        // 入力
        System.out.print("整数1を入力してください >");
        integralValue[0] = new java.util.Scanner(System.in).nextInt();
        System.out.print("整数2を入力してください >");
        integralValue[1] = new java.util.Scanner(System.in).nextInt();
        System.out.print("整数3を入力してください >");
        integralValue[2] = new java.util.Scanner(System.in).nextInt();

        // 計算
        for( int i=0; i < integralValue.length; i++ ) {
            sum += integralValue[i];
        }
        double ave = sum / integralValue.length;

        // 出力
        System.out.println("平均値は" + ave + "です");
    }
}
