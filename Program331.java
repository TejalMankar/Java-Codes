import java.util.*;
import java.io.*;

class Program328
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file that you want to unpacked : ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);
        FileInputStream = new FileInputStream(fobj);

        byte Header[] = new byte[100];

        fiobj.read(Header, 0, 100);

        String Hstr = new String(Header);

        System.out.println(Hstr);

        System.out.println("Length of Header string is "+Hstr.Length());

        String str = Hstr.trim();

        System.out.println("Length of Final header string is "+str.Length());

    }
}