import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Double p=sc.nextDouble();
        Double r=sc.nextDouble();
        Double t=sc.nextDouble();
        Double PI=(p*r*t)/100;
        System.out.println(PI);
    }
}