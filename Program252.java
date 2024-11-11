
import java.util.*;

class Program250
{
    public static void Display(int Brr[])
    {
        iCnt = 0;
        for(icnt = 0; iCnt < Brr.Length; iCnt++)
        {
            System.out.println(Brr[iCnt]+
            "\t");
        }
        System.out.println()
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner();  

        int iSize = 0, iCnt = 0;

        System.out.println("Enter the number of elements: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iNo; iCnt++)
        {
            Arr[iCnt] = sobj.nexInt();
        }

        Display(Arr[]);

        close sobj();
    }

}