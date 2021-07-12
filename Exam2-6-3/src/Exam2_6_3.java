public class Exam2_6_3 {
    public static void main(String[] args) {
        int sec, min, hour;

        System.out.print("秒数を入力してください >");
        sec = new java.util.Scanner(System.in).nextInt();
        hour = sec / 3600;
        min = (sec%3600) / 60;
        sec = sec % 60;

        System.out.println( hour + "時間" + min +"分" + sec + "秒");
    }
}
