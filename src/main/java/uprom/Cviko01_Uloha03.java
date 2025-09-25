package uprom;

import java.util.Scanner;

public class Cviko01_Uloha03
{
    public static void main(String[] args)
    {
        // Doplňte kód tak, aby vypsal nejmenší počet za sebou následujících celých čísel
        // počínaje 1, které je zapotřebí sečíst, aby součet byl větší než h.
        // Tento nejmenší počet vypište.
        // Například pro vstup „20“ vypište „6“, protože 1 + 2 + 3 + 4 + 5 + 6 > 20.

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int soucet = 0;
        int dalsi = 0;
        while(soucet <= h)
        {
            dalsi = dalsi + 1;
            soucet = soucet + dalsi;
        }
        System.out.println(dalsi);
    }
}
