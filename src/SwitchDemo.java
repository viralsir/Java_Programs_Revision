import java.util.Scanner;

/*
 control structure
 conditional control structure
   1) if  a)if else b) else if c)nested if
   2) switch
         for only one condition   equal to

    menu driven
 */
public class SwitchDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1=scanner.nextInt();
        System.out.println("Enter No2:");
        int no2=scanner.nextInt();


        System.out.println("\t\t\t Calculator ");
        System.out.println("press 1 for Addition");
        System.out.println("press 2 for Substraction");
        System.out.println("press 3 for Multiplication");
        System.out.println("press 4 for Division");

        System.out.println("Enter Your option :");
        int option=scanner.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Addition :"+ (no1+no2));
                //break;
            case 2:
                System.out.println("Subtraction :"+ (no1-no2));
                break;
            case 3:
                System.out.println("Multiplication :"+ (no1*no2));
                break;
            case 4:
                System.out.println("Division :"+ (no1/no2));
                break;
            default:
                System.out.println("Wrong option Selected !");
                break;
        }


    }

}
