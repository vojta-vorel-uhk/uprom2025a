package uprom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cviko10_Utils
{
    public static void fillExample(String[] texts)
    {
        String path = System.getProperty("user.dir")+"/data/words.txt";
        Scanner scanner;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            return;
        }
        int i=-1;
        while (scanner.hasNextLine())
        {
            i++;
            texts[i] = scanner.nextLine();
        }
    }
}
