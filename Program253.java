
import java.util.*;

class Program250
{
    public static int Addition(int Brr[])
    {
        int iCnt = 0, iSum = 0;

        for(icnt = 0; iCnt < Brr.Length; iCnt++)
        {
           iSum =  iSum + Brr.Length;
        }
        System.out.println()
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner();  

        int iSize = 0, iCnt = 0, iRet = 0;

        System.out.println("Enter the number of elements: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");
        for(iCnt=0; iCnt<iNo; iCnt++)
        {
            Arr[iCnt] = sobj.nexInt();
        }

        iRet = Addition(Arr[]);

        System.out.println("Addition of all the elements are: "+iRet);

        close sobj();
    }

}