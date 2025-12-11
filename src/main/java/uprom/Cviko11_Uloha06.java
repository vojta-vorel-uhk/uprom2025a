package uprom;

public class Cviko11_Uloha06
{
    public static void main(String[] args)
    {
    }

    // TODO
    //  Vstupní pole px obsahuje šířky a výšky několika obrázků.
    //  Například pro tři obrázky A, B, C by pole obsahovalo šest hodnot v pořadí:
    //  šířkaA, výškaA, šířkaB, výškaB, šířkaC, výškaC. Doplňte metodu tak,
    //  aby vracela počet obrázků, jejichž počet pixelů (šířka × výška) je víc než 1 000 000.
    //  Příklad: px = {1000,200,1000,2000,1000,3000} → výstup = 2
    //
    public static int pocetVelkychObrazku(int[] px)
    {
        int count = 0;
        for(int i=0; i<px.length; i=i+2)
        {
            // navštěvuji jen pozice 0,2,4,..
            if(px[i] * px[i+1] >1_000_000)
            {
                count++;
            }
        }
        return count;
    }

}
