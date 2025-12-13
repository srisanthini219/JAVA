import java.util.Scanner;
public class Kmtometer{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int kilometer=a*1000;
        System.out.println(kilometer);
        sc.close();
    }
}