package uprom;

import java.util.Scanner;

public class Cviko03_Uloha05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();

        if(rok % 4 == 0) { // Je dělitelný 4?
            if(rok % 100 == 0) { // Je dělitelný 100?
                if(rok % 400 == 0) { // Je dělitelný 400?
                    System.out.println("Je přestupný");
                }
                else {
                    System.out.println("Není přestupný");
                }
            }
            else {
                System.out.println("Je přestupný");
            }
        }
        else {
            System.out.println("Není přestupný");
        }
        // Vypiš, zda je zadaný rok přestupný
    }
}
