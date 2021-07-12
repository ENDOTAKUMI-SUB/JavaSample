public class Exam3_4_1 {
    public static void main(String[] args) {
        System.out.print("月を入力してください>");
        int inputMonth = new java.util.Scanner(System.in).nextInt();
        if (inputMonth == 12 | inputMonth == 1 | inputMonth == 2) {
            System.out.println("冬です");
        } else if (inputMonth >= 3 && inputMonth <= 5) {
            System.out.println("春です");
        } else if (inputMonth >= 6 && inputMonth <= 8) {
            System.out.println("夏です");
        } else if (inputMonth >= 9 && inputMonth <= 11) {
            System.out.println("秋です");
        } else {
            System.out.println("エラーです");
        }
    }
}
