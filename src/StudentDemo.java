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

        int rollno[]=new int[5];
        int maths[]=new int[5];
        int science[]=new int[5];
        int english[]=new int[5];
        String name[]=new String[5];

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

                        do {
                            System.out.println("Enter Student Roll No:");
                            rollno[i] = scanner.nextInt();

                        } while (!isPositive(rollno[i]));


                        System.out.println("Enter Student Name :");
                        name[i] = scanner.next();

                        //int maths=0;
                        maths[i] = validatemarks("Maths");

                        science[i] = validatemarks("Science");

                        english[i] = validatemarks("English");
                        i++;
                        System.out.println("Do you want to continue(y/n)?:");
                        option2=scanner.next();
                    }while(option2.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\n\n output :");


                    for (int j = 0; j < i; j++)
                    {

                        System.out.println("============ Student -"+ (j+1) + "==================");
                        System.out.println("Roll No:"+rollno[j]);
                        System.out.println("Name :"+name[j]);
                        System.out.println("Maths :"+maths[j]);
                        System.out.println("Science :"+science[j]);
                        System.out.println("English :"+english[j]);

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
