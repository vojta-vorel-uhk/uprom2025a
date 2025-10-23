package uprom;

import java.util.Random;
import java.util.Scanner;

public class Cviko05_Uloha03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = scanner.nextInt();
        for(int i=0; i<count; i++) // Cyklus s předem známým počtem opakování
        {
            System.out.println(random.nextInt(1001));
        }
        //	Vypiš "count" náhodných čísel mezi 0 a 1000
    }
}
