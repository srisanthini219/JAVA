import java.util.Scanner;
public class Main {
        public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int surfacearea=2*(l*b+l*b+l*h);
        int volume=l*b*h;
        
        System.out.println(surfacearea);
        System.out.println(volume);
        
        sc.close();
    }
}