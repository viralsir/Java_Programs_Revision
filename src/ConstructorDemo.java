/*
    Constructor : is a special function which is being
    used to inititalize the member variable .
    it is by default called when the object of the same
    class is created.
    constructor name and class name must be same .
    it does not have any return type.

 */

class Product
{
    int id=23;
    String name;
    int qty ;
    float rate;
    int discount;

    // constructor overloading
    // polymorphism : one name multiple use
    Product()
    {
        id=53;
        discount=5;
    }
    Product(int discount)
    {
        this.discount=discount;
    }

}
public class ConstructorDemo
{
    public static void main(String[] args) {

        Product product=new Product();
        product.id=55;
        Product product2=new Product(25);
        System.out.println(product.id);
        System.out.println(product.discount);
        System.out.println(product2.discount);

    }
}
