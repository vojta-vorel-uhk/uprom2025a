package uprom;

import java.util.Scanner;

public class Cviko05_Uloha01b
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String vstup;
        do
        {
            vstup = scanner.nextLine();
            if(vstup.contains(" "))//Více slov
                System.out.println("Zadej jenom jedno slovo!");
            else
                 System.out.println("Zadal jste slovo délky " + vstup.length());
        } while (!vstup.equals("KONEC"));

        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole.
        //   - Pokud bylo zadáno jednou slovo, vypiš např. "Zadali jste slovo délky 10"
        //   - Pokud bylo zadáno více slov, vypiš "Prosím, zadejte pouze jedno slovo"
        //   - Pokud bylo zadáno "KONEC", ukončit program
    }
}
