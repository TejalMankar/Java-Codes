import java.util.*; 
import java.io.*;

class Program307
{
    public static void main(String Arg []) throws Exception
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

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
}