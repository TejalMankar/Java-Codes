import java.uril.*;

class Program281
{
    public static int OffBit(int iNo, int iPos)
    {
        int iMask = 0X00000001; 
        int iResult = 0;

        iMask = shift << (iPos-1);
        iResult = iNo & iMask;

        if(IResult == iMask)
        {
            return(iNo ^ iMask); 
        }
        else
        {
            return iNo;
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        int iPos = 0;

        System.out.println("Enter numbre:");
        iNo = sobj.nextInt(); 

        System.out.println("Enter Position:");
        iPos = sobj.nextInt(); 

        iRet = OffBit(iNo, iPos);

        System.out.println("Updated number is: "+iRet);
        
    }
}