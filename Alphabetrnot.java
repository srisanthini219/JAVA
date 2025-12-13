import java.util.Scanner;
public class Alphabetrnot{
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if(ch>='A'&&ch<='Z'){
         System.out.println("is an alphabet");
         } else if(ch>='a'&&ch<='z'){
         System.out.println("is an alphabet");
    
     }else{
         System.out.println("symbol");
     }
     }
}
        