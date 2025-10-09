package uprom;

import java.util.Scanner;

public class Cviko03_Uloha01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uveďte hrubou mzdu v uplynulém měsíci: ");
        double hrubaMzda = scanner.nextDouble();
        System.out.println("Uveďte úroky z hypotéky a pojistné: ");
        double uroky = scanner.nextDouble();
        System.out.println("Kolikrát jsi byl darovat krev? ");
        int darovaniKrve = scanner.nextInt();
        double result = hrubaMzda - uroky - (3000 * darovaniKrve);
        System.out.println("Základ daně z příjmu je: ");
        System.out.println(result);

        // Doplň program tak, aby z hrubé mzdy a dalších informací vypočetl základ daně z příjmu.
        // Základ daně je hrubá mzda po odečtení těchto (nezdanitelných) výdajů:
        // - Zaplacené úroky z hypoték a pojistné na životním pojištění
        // - Náklady na darování krve (3000 Kč za každý odběr)


    }
}
