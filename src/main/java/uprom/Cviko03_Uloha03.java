package uprom;

import java.util.Scanner;

public class Cviko03_Uloha03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uveďte předběžnou daň z příjmu: ");
        double dan = scanner.nextDouble();
        System.out.println("Uveďte jestli máte průkaz ZTP/P: ");
        boolean ztpp = scanner.nextBoolean();
        System.out.println("Uveďte jestli jste student: ");
        boolean student = scanner.nextBoolean();

        if(ztpp) {
            dan = dan - 1345;
        }
        if(student) {
            dan = dan - 335;
        }
        dan = dan - 2570;

        if(dan < 0) {
            dan = 0;
        }
        System.out.println("Daň z příjmu po slevách je: ");
        System.out.println(dan);
        // Doplň program tak, aby z přeběžné daně vypočetl daň sníženou o slevy.
        // Pokud vyjde záporné číslo, výsledek se upraví na nulu.
        // - Měsíční sleva na poplatníka (2.570 Kč/měs)
        // - V případě, že je poplatník držitelem průkazu ZTP/P může uplatnit slevu ve výši 1345 Kč měsíčně
        // - Pokud je poplatník studentem do 26 let, může uplatnit slevu 335 Kč měsíčně

    }
}
