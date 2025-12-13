import java.util.Scanner;
public class AngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b+c==180&&a>0&&b>0&&c>0)
            System.out.println("Valid Triangle");
        else
            System.out.println("Not a Valid Triangle");

        sc.close();
    }
}
