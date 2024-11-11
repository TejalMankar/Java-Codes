// count 1

class Program26
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iCount = 0;

        System.out.println("Enter numbre: ");
        int iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            iNo = iNo / 2;
            System.out.print(iDigit);
            if(iNo == 1)
            {
                iCnt++;
            }
        } 
        System.out.println("Number of 1 bit are: "+iCnt);
    }
}