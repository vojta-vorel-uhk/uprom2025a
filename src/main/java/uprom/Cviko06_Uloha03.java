package uprom;

import java.util.Scanner;

public class Cviko06_Uloha03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = 0;
        for(int i=0; i<line.length(); i++)
        {
            if(line.charAt(i) == ' ')
                count++;
        }
        System.out.println("Mezer bylo "+count);
        // Z konzole načti řetězec
        // Vypiš, kolik v tomto řetězci je mezer
    }
}
