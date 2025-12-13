import java.util.Scanner;
public class OctalToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oct = sc.next();
        int n = Integer.parseInt(oct, 8);
        System.out.println(n);
    }
}
