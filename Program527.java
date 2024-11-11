import java.util.*;

class Program527
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        HashMap <Character, Integer> hobj = new HashMap<>();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(hobj.containsKey(Arr[iCnt]))
            {
                Frequency = hobj.get(Arr[iCnt]);
                hobj.put(Arr[iCnt], Frequency);
            }
            else
            {
                hobj.put(Arr[iCnt],1);
            }
        }

        System.out.println(hobj);
    }
}