public class Exam3_3_3 {
    public static void main(String[] args) {
        final String userID = "java";
        final String userPassWord = "1234";

        System.out.print("IDを入力してください >");
        String inputUserID = new java.util.Scanner(System.in).nextLine();
        System.out.print("パスワードを入力してください >");
        String inputUserPassWord = new java.util.Scanner(System.in).nextLine();
        if (inputUserID.equals(userID) && inputUserPassWord.equals(userPassWord)) {
            System.out.println("ログインしました");
        } else {
            System.out.println("IDかパスワードが間違っています");
        }
    }
}
