package uprom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cviko05_Uloha02
{
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/data/obce.txt";
        Scanner scanner = new Scanner(new File(path));
        int pocetViceslovnych = 0;
        int pocetVsech = 0;
        while(scanner.hasNextLine())
        {
            pocetVsech = pocetVsech+1;
            String obec = scanner.nextLine();
            if(obec.contains(" "))
                pocetViceslovnych=pocetViceslovnych+1; //nebo pocetViceslovnych++
        }
        double procenta = pocetViceslovnych
                * 100d
                / pocetVsech;
        System.out.println(procenta + " %");
        // Vypiš, kolik procent obcí v ČR má víceslovný název
    }
}
