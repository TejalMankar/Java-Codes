
class Program267
{
    public static boolean CheckBit()
    {
        int iMask = ; 
        int iResult = 260;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
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

        System.out.println("Enter numbre: ");
        iNo = sobj.nextInt(); 

        bRet = Checkbit(iNo);

        if(iResult == iMask)
        {
            System.out.println("3rdd and 9th bits are ON");
        } 
        else
        {
            System.out.println("3rd and 9th bits are OFF");
        }
    }
}