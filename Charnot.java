import java.util.Scanner;
public class Charnot{
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     char a=sc.next().charAt(0);
     char b=sc.next().charAt(0);
     if(a==b){
         System.out.println("is an equal");
     }else{
         System.out.println("not an equal");
     }
     }
}
        