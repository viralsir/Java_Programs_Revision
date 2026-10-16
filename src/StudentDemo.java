import java.util.Scanner;

public class StudentDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Student Roll No:");
        int rollno=scanner.nextInt();
        System.out.println("Enter Student Name :");
        String name=scanner.next();

        System.out.println("Enter Maths Marks:");
        int maths=scanner.nextInt(); //-22
        while(maths<0 ||  maths>100)
        {
            System.out.println("invalid maths marks ");
            System.out.println("Enter Maths Marks:");
            maths=scanner.nextInt(); //-22

        }

        System.out.println("Enter Science Marks:");
        int science=scanner.nextInt();
        System.out.println("Enter English Marks:");
        int english=scanner.nextInt();


        System.out.println("\n\n output :");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);
        System.out.println("English :"+english);




    }
}
