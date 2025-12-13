import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        char op=sc.next().charAt(0);
        float result;
        switch(op){
            case '+':
                result=(a+b);
                System.out.println("add");
                break;
            case '-':
                result=(a-b);
                System.out.println("sub");
                break;
            case '*':
                result=(a*b);
                System.out.println("multi");
                break;
            case '/':
                result=(a/b);
                System.out.println("div");
                break;
            default:
                System.out.println("Invalid");
                
        }
    }
}