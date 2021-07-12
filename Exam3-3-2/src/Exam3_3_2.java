public class Exam3_3_2 {
    public static void main(String[] args) {
        System.out.print("文字列1を入力してください >");
        String text1 = new java.util.Scanner(System.in).nextLine();
        System.out.print("文字列2を入力してください >");
        String text2 = new java.util.Scanner(System.in).nextLine();
        if(text1.equals((text2))) {
            System.out.println("同じ文字列が入力されました");
        } else {
            System.out.println("異なる文字列が入力されました");
        }
    }
}
