package uprom;

import java.util.Scanner;

public class Cviko06_Uloha01
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        for (int i=0;i<line.length();i++)
        {
            System.out.println(line.charAt(i));
        }
        // Načtěte z konzole řetězec
        // Vypište ho "shora dolů" (jako jeden znak na každý řádek)
    }
}
