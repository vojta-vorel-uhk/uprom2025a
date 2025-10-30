package uprom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cviko06_Uloha05
{
    public static void main(String[] args) throws FileNotFoundException {
        String path = System.getProperty("user.dir")+"/data/obce.txt";
        Scanner scanner = new Scanner(new File(path));
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            for(int i=0; i<line.length()-2;i++)
            {
                if(line.charAt(i) == 'A'
                && line.charAt(i+2) == 'A')
                {
                    System.out.println(line);
                    break;
                }
            }
        }
        // Ze souboru hesla.txt vypiš řádky,
        // které obsahují podřetězec ve tvaru A**A
    }
}
