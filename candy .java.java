import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int candy=sc.nextInt();
        int a=candy/6;
        int b=a-students;
        System.out.println(b);
    }
}