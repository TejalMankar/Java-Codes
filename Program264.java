// count 1

class Program264
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iMask = 4; 
        int iResult = 0;

        System.out.println("Enter numbre: ");
        int iNo = sobj.nextInt();

        iResult = iNo & iMask;

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