
class Program265
{
    public static boolean CheckBit()
    {
        int iMask = 4; 
        int iResult = 0;
        boolean bRet = false;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        else
        {
            return false;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
       
        System.out.println("Enter numbre: ");
        int iNo = sobj.nextInt(); 

        bRet = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("3rd bit is ON");
        } 
        else
        {
            System.out.println("3rd bit is OFF");
        }
    }
}