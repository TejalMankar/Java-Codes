import java.uril.*;

class Program276
{
    public static int OffBit(int iNo)
    {
        int iMask = 0X00000400; 
        int iResult = 0;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return (iNo ^ iMask);
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

        System.out.println("Enter numbre: ");
        iNo = sobj.nextInt(); 

        iRet = OffBit(iNo);

        System.out.println("Updated number is: "+iRet);
        
    }
}