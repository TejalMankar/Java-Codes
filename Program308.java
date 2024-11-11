import java.util.*; 
import java.io.*;

class Program307
{
    public static void main(String Arg [])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        try 
        {
            File fobj = new File(FileName);

            boolean bret = false;

            bret = fobj.createNewFile();

            if (bret == true)
            {
                System.out.println("File gets Successfully created");
            }
            else
            {
                System.out.println("File not created");
            }
        }

        catch(IOException obj)
        {
            System.out.println("Exception occured");
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured");   
        }
    }
}