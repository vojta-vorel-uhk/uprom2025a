package uprom;

import java.util.Scanner;

public class Cviko06_Uloha06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int emptyLines = 0;
        do {
            String line = scanner.nextLine();
            if(line.equals(""))
                emptyLines++;
            else
                emptyLines = 0;
        } while (emptyLines < 5);
        // Načítej řádky z konzole.
        // Pokud byl pětkrát za sebou zadán prázdný řádek, program končí
    }
}
