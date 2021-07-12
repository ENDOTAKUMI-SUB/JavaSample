public class Exam4_4_2 {
    public static void main(String[] args) {
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + "人目の点数を入力してください>");
            array[i] = new java.util.Scanner(System.in).nextInt();
        }

        int intMax = array[0];
        int intMin = array[0];
        int count = 1;
        int countMax = 1;
        int countMin = 1;

        for (int point : array) {
            if (intMax < point) {
                intMax = point;
                countMax = count;
            }
            if (intMin > point) {
                intMin = point;
                countMin = count;
            }
            count++;
        }
        System.out.println("最高得点は"+countMax+"人目の" + intMax + "点です");
        System.out.println("最低得点は"+countMin+"人目の" + intMin + "点です");
    }
}
