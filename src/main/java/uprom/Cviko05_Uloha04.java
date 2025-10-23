package uprom;

import java.util.Scanner;

public class Cviko05_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String best = "";
        for(int i=0; i<count; i++)
        {
            String line = scanner.nextLine();
            if(line.length() > best.length())
            { best = line;}
        }
        System.out.println("Best: "+best);
        // Přečti z konzole "count" řetězců
        // a nakonec vypiš nejdelší z nich
    }
}
