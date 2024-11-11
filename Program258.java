
import java.util.*;

class Program256
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner();  
        String str = null;

        System.out.println("Enter the name: ");
        str = sobj.nextLine();

       char Arr = str.toCharArray();
       int iCnt = 0;

       for(iCnt = 0; iCnt < Arr.length(); iCnt++)
       {
        System.out.println(Arr[iCnt]);
       } 
        
        sobj.close();
    }

}