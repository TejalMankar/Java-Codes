import java.util.*;
import java.io.*;

class Program320
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

        System.out.println("Enter the name of the packed file that want to craete");
        String PackedFile = sobj.NextLne();

        File fobjPack = new File(PackedFile);

        System.out.Println("")

        boolean bret = false;
        File fobj = new File(DirectoryName);

        bret = fobj.isDirectory();
        if(bret == true) 
        {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            System.out.println("Number of files in the directory are : "+Arr.length);

            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println("File name : "+ Arr[i].getName() + " File size : "+Arr[i].length());
            }
        }
        else 
        {
            System.out.println("There is no such directory");
        }
    }
}
