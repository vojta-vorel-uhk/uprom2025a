package uprom;

import java.io.IOException;
import java.util.Scanner;

public class Cviko04_Uloha07
{
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.length() == 11
                    && line.charAt(6) == '/' )
            {
                if(line.charAt(2) == '5'
                || line.charAt(2) == '6')
                    System.out.println("Žena");
                else
                    System.out.println("Muž");
            }
            else
            {
                System.out.println("NOT OK");
            }
        }
        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat zda jde o rodné číslo muže nebo ženy (pokud je platné).
        //  Pokud není platné, vypsat "NOT OK".
    }
}
