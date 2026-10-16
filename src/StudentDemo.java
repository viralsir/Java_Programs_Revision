import java.util.Scanner;

public class StudentDemo
{

   static  int validatemarks(String subject)
    {
        Scanner scanner=new Scanner(System.in);
        int marks=0;
        do {
            System.out.println("Enter "+ subject + " Marks (0-100):");
            marks = scanner.nextInt(); //-22
        } while (marks < 0 || marks > 100);
        return marks;
    }

    static boolean  isPositive(int no)
    {
        if(no>0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        int rollno=0;
        do {
            System.out.println("Enter Student Roll No:");
            rollno=scanner.nextInt();

        }while(isPositive(rollno));


        System.out.println("Enter Student Name :");
        String name=scanner.next();

        //int maths=0;
        int maths=validatemarks("Maths");

        int science=validatemarks("Science");

        int english=validatemarks("English");

        System.out.println("\n\n output :");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);
        System.out.println("English :"+english);




    }
}
