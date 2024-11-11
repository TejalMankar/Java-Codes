import java.uril.*;

class Program281
{
    public static int CheckBit(int iNo)
    {
        int iMask = 0X00000001; 
        int iResult = 0;

        iMask = shift << (iPos-1);
        iResult = iNo & iMask;

        if(IResult == iMask)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bRet = false;
        int iPos = 0;

        System.out.println("Enter numbre:");
        iNo = sobj.nextInt(); 

        System.out.println("Enter Position:");
        iPos = sobj.nextInt(); 

        iRet = CheckBit(iNo, iPos);

        if(bRet == true)
        {
            System.out.println("Bit is ON")
        }
        else
        {
        System.out.println("Bit is OFF");
        }
        
    }
}