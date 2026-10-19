import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Exception : is the message which is being display when
    run time error is occured.

    Exception handling :
    try
    catch
    throws
    throw


 */

public class ExceptionDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        boolean iserror=false;
        do {

            try
            {
                System.out.println("Enter No1:");
                int no1=scanner.nextInt();
                System.out.println("Enter No2:");
                int no2=scanner.nextInt();

                int ans=no1/no2;

                System.out.println("Answer :"+ans);
                iserror=false;
            }
            catch (ArithmeticException ae){
                System.out.println("zero is invalid");
                iserror=true;
            }
            finally {
                System.out.println("finally blocked executed.");
            }
//            catch (InputMismatchException ie)
//            {
//                System.out.println("character is not allowed");
//                iserror=true;
//               // no1=0;no2=0;
//            }
            System.out.println("after catch block");


        }while(iserror);

    }
}
