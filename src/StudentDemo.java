import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    int rollno;
    String name;
    int maths;
    int science;
    int english;


     void entry()
     {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter Student Roll No:");
             rollno=scanner.nextInt();
             System.out.println("Enter Student Name :");
             name=scanner.next();
             maths=validatemarks("Maths");
             science=validatemarks("Science");
             english=validatemarks("English");
     }

     void view()
     {
         System.out.println("Roll No:"+rollno);
         System.out.println("Name :"+ name);
         System.out.println("Maths :"+ maths);
         System.out.println("Science :"+ science);
         System.out.println("English :"+ english);

     }

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


}



public class StudentDemo
{


    static boolean  isPositive(int no)
    {
        if(no>0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {

          ArrayList<Student> studentlist=new ArrayList<Student>();


        //rollno[0] , rollno[1] , rollno[2] , ---- rollno[n-1]
        Scanner scanner=new Scanner(System.in);
        int option=0;
        String option2="";
        int i=0;
        do {
            System.out.println("\t\t Student Corner ");
            System.out.println("\t\t 1. Entry ");
            System.out.println("\t\t 2. View");
            System.out.println("\t\t 3. Exit");

            System.out.println("Enter your option :");
            option=scanner.nextInt();

            switch (option)
            {
                case 1:
                    do
                    {
                            Student s1=new Student();
                            s1.entry();
                            studentlist.add(s1);

                        System.out.println("Do you want to continue(y/n)?:");
                        option2=scanner.next();
                    }while(option2.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\n\n output :");


                    for (Student s1:studentlist)
                    {
                        s1.view();

                    }

                    break;
                case 3:
                    System.out.println("you are exited ");
                    break;
                default :
                    System.out.println("wrong option selected try again !!!");
                    break;
            }



        }while(option!=3);










    }
}
