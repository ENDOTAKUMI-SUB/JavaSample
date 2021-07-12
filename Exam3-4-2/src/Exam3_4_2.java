public class Exam3_4_2 {
    public static void main(String[] args) {
        System.out.print("月を入力してください>");
        int inputMonth = new java.util.Scanner(System.in).nextInt();
        switch (inputMonth) {
            case 3:
            case 4:
            case 5:
                System.out.println("春です");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏です");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋です");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬です");
                break;
            default:
                System.out.println("エラーです");

        }
    }
}
