package uprom;

import java.util.Scanner;

public class Cviko04_Uloha06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.length() == 11
                    && line.charAt(6) == '/' )
            {
                System.out.println("OK");
            }
            else
            {
                System.out.println("NOT OK");
            }
        }
        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat "OK" pokud má 11 znaků, sedmým znakem je lomítko
        //  a ostatní znaky jsou číslice.
        //  V opačném případě vypsat "NOT OK".

    }
}
