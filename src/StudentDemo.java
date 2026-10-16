import java.util.Scanner;

public class StudentDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Student Roll No:");
        int rollno=scanner.nextInt();
        System.out.println("Enter Student Name :");
        String name=scanner.next();
        int maths=0;
        do
        {

            System.out.println("Enter Maths Marks (0-100):");
            maths=scanner.nextInt(); //-22

        }while(maths<0 ||  maths>100);

        int science=0;
        do {
            System.out.println("Enter Science Marks(0-100):");
            science=scanner.nextInt();

        }while(science<0 ||  science>100);

        int english=0;
        do
        {
            System.out.println("Enter English Marks(0-100):");
            english=scanner.nextInt();
        }while(english<0 || english>100);


        System.out.println("\n\n output :");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);
        System.out.println("English :"+english);




    }
}
