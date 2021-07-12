public class Challenge10 {
    public static void main(String[] args) {
        System.out.print("西暦を入力してください >");
        int year = new java.util.Scanner(System.in).nextInt();

        boolean yearCheck = false;

        if (year % 4 == 0) {    // 4で割れる年は原則「うるう年」
            if ((year % 100) == 0) {        // 100で割れたら「平年」
                if ((year % 400) == 0) {    // 400で割れたら「うるう年」
                    yearCheck = true;    // うるう年
                }
            } else {    // 100で割れなかった＼(^o^)／
                yearCheck = true;    // うるう年
            }
        }

        System.out.println(yearCheck ? "うるう年" : "平年");
    }
}
