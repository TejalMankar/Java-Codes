import  java.util.*;

class Matrix
{
    public void Display(int Arr[][])
    {
        int i = 0, j = 0;

        System.out.println("Entered elemets are : ");
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.println(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Program386
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;

        System.out.printf("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.printf("Enter number of coloums : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int [iRow][iCol];
        int i = 0, j = 0;

        System.out.println("Enter the elements : ");
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        Matrix mobj = new Matrix();
        mobj.Display(Arr);
    }
}