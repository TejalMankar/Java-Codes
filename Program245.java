import java.util.*;

class Program245
{
    public static int Factorial(int iNo)
    {
        iFact = 1;
        iCnt = 0;

        iCnt = 1;
        while(iCnt <= iNo)
        {
            iFact = iFact*iNo; 
        }
        return iFact;

    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner();  

        int iValue = 0, int iAns = 0;

        System.out.println("Enter number : ");
        iValue1 = sobj.nextInt();

        iAns = Factorial(iValue);

        System.out.println("Factorial is: "+iAns);
        close sobj();
    }

}