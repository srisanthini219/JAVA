mport java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int basic =sc.nextInt();
        int HRA =sc.nextInt();
        int allowence=sc.nextInt();
        int a=basic+HRA+allowence;
        System.out.println(a);
    }
}