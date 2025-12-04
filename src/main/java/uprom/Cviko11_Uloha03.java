package uprom;

import java.io.FileNotFoundException;

public class Cviko11_Uloha03
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int[] test = new int[]{68,67,98,67,387,397,63,698,988,397,322,340,570,878};

        // TODO
        //  Doplň metodu evenValues tak, aby ze vstupního pole vybrala sudá čísla
        //  a vrátila je ve výstupním poli.
        //  Otestuj metodu evenValues a vypiš délku výstupního pole.
    }

    public static int[] evenValues(int[] values)
    {
        // Nápověda 1
        //  Spočítej, kolik prvků ve vstupním poli má sudou hodnotu
        //  Tento počet ulož do proměnné resultCount
        int count = 0;
        for(int i=0; i<values.length; i++){
            if(values[i] % 2 == 0){
                count = count + 1;
            }
        }
        // Nápověda 2
        //  Založ pole result (se správnou délkou) a naplň ho sudými čísly
        int[] result = new int[count];
        int k = 0;
        for(int i=0; i<values.length; i++)
        {
            if(values[i] % 2 == 0)
                result[k] = values[i];
            k = k+1;
        }
        return result;
    }
}
