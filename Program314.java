import java.util.*; 
import java.io.*;

class Program314
{
    public static void main(String Arg [])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        try 
        {
           
           FileInputStream fobj = new FileInputStream(FileName);

           byte b = fobj.read();
           System.out.println((char) b);

           fobj.close();
        }

        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }
        
    }
}