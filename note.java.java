import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount % 100 != 0) {
            return;
        }
         int notes2000 = amount / 2000;
        amount %= 2000;
        int notes500 = amount / 500;
        amount %= 500;
        int notes100 = amount / 100;
        amount %= 100;
        System.out.println(+ notes2000);
        System.out.println( + notes500);
        System.out.println( + notes100);

    }
}