//Split activity we was stop unpacking project will conclude later 
// Programs on strings 

import java.util.*;
import java.io.*;

class Program341
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.NextLine();

        str = str.trim();

        System.out.println("After trim : "+str);

        str = str.replaceAll("\\s+"," ");

        System.out.println("Aftre replaceall : "+ str);

    }
}