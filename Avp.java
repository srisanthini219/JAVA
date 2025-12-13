import java.util.Scanner;
public class Avp{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int surfacearea=6*a*a;
        int volume=a*a*a;
        int perimeter=12*a*a;
        System.out.println(surfacearea);
        System.out.println(volume);
        System.out.println(perimeter);
        sc.close();
    }
}