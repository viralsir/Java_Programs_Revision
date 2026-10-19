interface Marksheet
{
    int PASSING_MARK=33; // all the variable declared inside an interface are by default public and final
    void setStudentData();  // all function in the interface are by default public
    void displayStudentData();
    int validatemarks();

}
abstract class absdemo1
{
    abstract void display();
}

abstract class abs implements Marksheet
{

    @Override
    public void setStudentData() {

    }

    @Override
    public void displayStudentData() {

    }


}
//interface  i1 extends Marksheet
//{
//  void setI();
//}
//interface  i3 extends  i1,Marksheet
//{
//
//}
// you can't create an object of an interface.
public class infdemo  extends  abs  //implements Marksheet
{


    void isPass_Fail()
    {

    }

    public static void main(String[] args) {

        Marksheet marksheet=new infdemo();

        //infdemo infdemo1=new infdemo();
        marksheet.displayStudentData();
        //marksheet.is



    }

    @Override
    public int validatemarks() {
        return 0;
    }
}
