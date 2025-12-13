import java.util.Scanner;
public Pow2 main 
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=9;
       if(a>0 && (a&(a-1))==0)
          System.out.println("Power of two");  
       
       else
           System.out.println("Not the Power of two");
    }
}