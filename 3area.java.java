import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double csa = 2 * Math.PI * r * h;
        double tsa = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;

        System.out.println(csa);
        System.out.println(tsa);
        System.out.println(volume);
    }
}
