public class Exam2_6_1 {
    public static void main(String[] args) {
        System.out.println("サイコロを振ります");
        int dice = new java.util.Random().nextInt(6) + 1;
        System.out.println(dice);
    }
}
