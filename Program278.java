import java.uril.*;

class Program278
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0X00000040; 
        int iResult = 0;
        iResult = iNo & iMask;

        return (iNo ^ iMask); 
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter numbre: ");
        iNo = sobj.nextInt(); 

        iRet = ToggleBit(iNo);

        System.out.println("Updated number is: "+iRet);
        
    }
}