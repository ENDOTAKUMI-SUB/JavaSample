public class Exam3_6_2 {
    public static void main(String[] args) {
        int[] num = new int[4];
        while(true) {
            System.out.print("1~3の整数を入力してください(0で終了) >");
            int integer = new java.util.Scanner(System.in).nextInt();
            switch (integer){
                case 0:
                    break;
                case 1:
                    num[0] ++;
                    break;
                case 2:
                    num[1] ++;
                    break;
                case 3:
                    num[2] ++;
                    break;
                default:
                    num[3] ++;
                    break;
            }
            if (integer == 0) {
                break;
            }
        }

        System.out.println("1が入力された回数　　："+num[0]);
        System.out.println("2が入力された回数　　："+num[1]);
        System.out.println("3が入力された回数　　："+num[2]);
        System.out.println("その他が入力された回数："+num[3]);
    }
}

