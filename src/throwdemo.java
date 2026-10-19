import java.util.Scanner;

class MathException extends Exception
{
    String msg;
    MathException(String msg)
    {
        this.msg=msg;
    }
    String displayMsg()
    {
        return this.msg;
    }
}
public class throwdemo
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
 try {
     System.out.println("Enter No1:");
     int no1 = scanner.nextInt();
     System.out.println("Enter No2:");
     int no2 = scanner.nextInt();

     if (no1 > 0 && no2 > 0) {
         System.out.println("Max :" + ((no1 > no2) ? no1 : no2));
     } else {
         throw new MathException("Nagetive no is not allowed");

     }
 }catch (MathException me)
 {
     me.displayMsg();
 }
    }
}
