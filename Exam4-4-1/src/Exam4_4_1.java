public class Exam4_4_1 {
    public static void main(String[] args) {
        int[] array = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "人目の点数を入力してください>");
            array[i] = new java.util.Scanner(System.in).nextInt();
        }

        int intMax = array[0];

        for (int point : array) {
            if (intMax < point) {
                intMax = point;
            }
        }
        System.out.println("最高得点は" + intMax + "点です");
    }
}
