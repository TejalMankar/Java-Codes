
import java.util.*;

class Program255
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner();  
        String str = null;

        System.out.println("Enter the name: ");
        str = sobj.nextLine();

        System.out.println("Your name is: "+str.length());
       
        sobj.close();
    }

}