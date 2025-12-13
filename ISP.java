import java.util.Scanner;
public class ISP {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.print("Enter ISP (1-Jio, 2-Airtel, 3-Vi): ");
       int ispChoice = scanner.nextInt();
       scanner.nextLine(); 


       String ispName = "";
       switch (ispChoice) {
           case 1:
               ispName = "Jio";
               break;
           case 2:
               ispName = "Airtel";
               break;
           case 3:
               ispName = "Vi";
               break;
           default:
               System.out.println("Invalid ISP choice.");
               return;
       }


       System.out.print("Enter Plan Code (A/B/C): ");
       char planCode = scanner.nextLine().toUpperCase().charAt(0);


       String price = "";
       String dataBenefit = "";
       String validity = "28 Days";


       switch (planCode) {
           case 'A':
               price = "₹199";
               dataBenefit = "1.5GB/day";
               break;
           case 'B':
               price = "₹299";
               dataBenefit = "2GB/day";
               break;
           case 'C':
               price = "₹399";
               dataBenefit = "3GB/day";
               break;
           default:
               System.out.println("Invalid Plan Code.");
               return;
       }


       System.out.println("ISP Selected: " + ispName);
       System.out.println("Plan " + planCode + " Selected");
       System.out.println("Price: " + price);
       System.out.println("Data: " + dataBenefit);
       System.out.println("Validity: " + validity);
   }
}


