import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Balance = " + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                int d = sc.nextInt();
                balance = balance + d;
                System.out.println("New Balance = " + balance);
                break;
            case 3:
                System.out.print("Enter withdraw amount: ");
                int w = sc.nextInt();
                if (w <= balance) {
                    balance = balance - w;
                    System.out.println("Remaining Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
