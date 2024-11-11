
class Program267
{
    public static boolean CheckBit()
    {
        int iMask = 16448; 
        int iResult = 0;
        
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
            System.out.println("7th and 15th bits are ON");
        } 
        else
        {
            System.out.println("7th and 15th bits are OFF");
        }
    }
}