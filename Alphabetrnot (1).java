import java.util.Scanner;
public class Digitrnot{
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if(ch>='0'&&ch<='9'){
         System.out.println("is an digit");
     }else{
         System.out.println("not an digit");
     }
     }
}
        