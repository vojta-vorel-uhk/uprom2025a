package uprom;

import java.util.Scanner;

public class Cviko04_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.equals("KONEC")){
                return; // Ukončí program
                //break;  // Ukonči jen cyklus
            }
            System.out.println(line.length());
        }



        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat na konzoli délku tohoto řetězce.
        //  Pokud bylo zadáno "KONEC", ukončit program
    }
}
