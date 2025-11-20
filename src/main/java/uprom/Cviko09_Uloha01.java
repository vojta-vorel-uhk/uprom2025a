package uprom;

import java.util.Scanner;

public class Cviko09_Uloha01
{
    public static void main(String[] args)
    {
        System.out.println("Zadej deset hodnot:");
        Scanner s = new Scanner(System.in);
        //TODO: Načtěte z konzole deset celých čísel
        int[] pole1 = new int[10];
        for(int i=0; i<pole1.length; i++)
        {
            pole1[i] = s.nextInt();
        }
        System.out.println("Vaše hodnoty v opačném pořadí:");

        for(int i=pole1.length-1; i>=0; i--){
            System.out.println(pole1[i]);
        }
        for(int i=0; i<pole1.length; i++){
            System.out.println(pole1[pole1.length-i-1]);
        }
        //TODO: Vypiš čísla v opačném pořadí
    }
}
