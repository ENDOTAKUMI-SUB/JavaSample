public class Exam4_4_2_x {
    public static void main(String[] args) {
        // 配列変数 array を宣言
        int[] array = new int[3];

        // 配列変数 array[] に 得点を代入
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + "人目の点数を入力してください>");
            array[i] = new java.util.Scanner(System.in).nextInt();
        }


        // 一人目のデータを暫定　最大、最低値として扱う
        int arrayMax = array[0];
        int arrayMin = array[0];
        int count = 1;
        int countMax = 1;
        int countMin = 1;

        // 判定
        for (int point : array) {
            // arrayMax より大きければ更新
            if (arrayMax < point) {
                arrayMax = point;
                countMax = count;
            }
            // arrayMin より小さければ更新
            if (arrayMin > point) {
                arrayMin = point;
                countMin = count;
            }
            count++;
        }
        System.out.println("最高得点は"+countMax+"人目の" + arrayMax + "点です");
        System.out.println("最低得点は"+countMin+"人目の" + arrayMin + "点です");
    }
}
