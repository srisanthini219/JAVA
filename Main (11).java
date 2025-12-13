import java.util.Scanner;
public class Main {
        public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double surfacearea=4*Math * r * r * r;

        double volume = (4.0/3.0) * Math.PI * r * r * r;

        System.out.println(surfacearea);
        System.out.println(volume);
        
        sc.close();
    }
}