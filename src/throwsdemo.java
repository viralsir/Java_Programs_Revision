import java.io.DataInputStream;
import java.io.IOException;

public class throwsdemo
{
    public static void main(String[] args)throws IOException
    {

        DataInputStream din=new DataInputStream(System.in);


            System.out.println("Enter No:");
            int no1 = din.readInt();

        System.out.println("no1:"+no1);
    }
}
