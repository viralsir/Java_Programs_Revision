import java.util.Scanner;

/*
    Inheritance : : is the proccess by which object of one class
    can access or get the properties of object of another class.

    class A
    {
         int noA;
     }
     class B extends A
     {
            int noB;
      }
      A a1=new A();
      a1.noA

     B b1=new B();
     b1.noA
     b1.noB

       category of inheritance
       1)Single Inheritance : one object can access or get the properties of only one object at  a time.
                    A   super class / parent class / base class
                    |
                    B     sub class / child class / derived class
        2)Multilevel Inheritance : continous Chain of Single Inheritance
                A
                |
                B
                |
                C
                |
                D

        3)Hyrarchical Inheritance : more than one object can
        access or get the properties of same object .
                   A
            |              |
            B               C

        4)Multiple Inheritance : one object can access or get the properties of more than one object at a time.

                             A                 B
                                       |
                                       C
         in java one object can access only one object at a time.
         multiple is not supported.

         5) hybrid Inheritance : combination of more than one inheritance is called hybrid inheritance

 */
class Personal_info
{
    int id;
    String name;
    String phone_number;


    Personal_info(){
        System.out.println("personal info() is called");
    }

    void setPersonal_info()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Id:");
        id= scanner.nextInt();
        System.out.println("Enter Name :");
        name=scanner.next();
        System.out.println("Enter Phone Number:");
        phone_number=scanner.next();
    }

    void getPersonal_info()
    {
        System.out.println("Id :"+id);
        System.out.println("name :"+name);
        System.out.println("Phone Number:"+phone_number);
    }

     void Display()
     {
         System.out.println("display from personal_info is called");
     }

}
class Employee extends Personal_info
{
     int salary;
     String department;

     Employee()
     {
         System.out.println("employee constructor is called");
     }

     void setEmployee()
     {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter Salary :");
         salary=scanner.nextInt();
         System.out.println("Enter Department Name :");
         department=scanner.next();
     }
     void getEmployee()
     {
         System.out.println("Salary :"+salary);
         System.out.println("Department :"+department);
     }
     void Display()
     {
         System.out.println("display from employee is called.");
     }

}
class Customer extends Personal_info
{
        int billamount;
        String billdate;

        void setCustomer()
        {
             setPersonal_info();
             Scanner scanner=new Scanner(System.in);

            System.out.println("Enter bill amount :");
            billamount=scanner.nextInt();
            System.out.println("Enter bill date:");
            billdate=scanner.next();

        }

        void getCustomer()
        {
            getPersonal_info();
            System.out.println("Bill amount :"+billamount);
            System.out.println("Bill Date :"+billdate);
        }

}
class Dmart extends  Employee
{
    String location;

    Dmart()
    {
        System.out.println("Dmart is called");
    }

    void setDmart()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter DMart Location :");
        location=scanner.next();

    }
    void getDmart()
    {
        System.out.println("Dmart Location :"+location);
    }

}


public class InheritanceDemo
{
    public static void main(String[] args) {

//        //Employee employee=new Employee();
//        Dmart dmart=new Dmart();
//        dmart.setDmart();
//        dmart.setPersonal_info();
//        dmart.setEmployee();
//
//        dmart.getDmart();
//        dmart.getPersonal_info();
//        dmart.getEmployee();
//
//        Customer customer=new Customer();
//        customer.setCustomer();
//        customer.getCustomer();

        //Dmart dmart=new Dmart();
        //Employee employee=new Dmart();
        //Dmart dmart=new Employee();

        //Employee employee=new Employee();
        Personal_info employee=new Employee();
        employee.Display();

    }
}
