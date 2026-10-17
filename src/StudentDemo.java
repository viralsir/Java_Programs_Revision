import java.util.ArrayList;
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

        /*'
            ArrayList    : dynamic  , all data type
            LinkedList
            List
            HashTable
            HashMap

         */

        ArrayList <Integer>rollnolist=new ArrayList<Integer>();
        ArrayList <Integer>mathslist=new ArrayList<Integer>();
        ArrayList <Integer>sciencelist=new ArrayList<Integer>();
        ArrayList <Integer>englishlist=new ArrayList<Integer>();
        ArrayList <String>namelist=new ArrayList<String>();



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
                            rollnolist.add(scanner.nextInt());

                        } while (!isPositive(rollnolist.get(i)));


                        System.out.println("Enter Student Name :");
                        namelist.add(scanner.next());

                        //int maths=0;
                        mathslist.add(validatemarks("Maths"));

                        sciencelist.add(validatemarks("Science"));

                        englishlist.add(validatemarks("English"));
                        i++;
                        System.out.println("Do you want to continue(y/n)?:");
                        option2=scanner.next();
                    }while(option2.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\n\n output :");


                    for (int j = 0; j < rollnolist.size(); j++)
                    {

                        System.out.println("============ Student -"+ (j+1) + "==================");
                        System.out.println("Roll No:"+rollnolist.get(j));
                        System.out.println("Name :"+namelist.get(j));
                        System.out.println("Maths :"+mathslist.get(j));
                        System.out.println("Science :"+sciencelist.get(j));
                        System.out.println("English :"+englishlist.get(j));

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
