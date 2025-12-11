package uprom;

public class Cviko12_Uloha01
{
    public static void main(String[] args)
    {
        int[] p = new int[10];
        System.out.println(p[9]);
        int[] r = new int[]{ 1, 2, 3, 4 };
        System.out.println(r[2]);
    }

    public static int ovladlAdamek(int[] adamek, int[] barta, int[] cibulka)
    {
        if(adamek.length != barta.length
                || adamek.length != cibulka.length)
        {
            return -1;
        }
//        if(!(adamek.length == barta.length && adamek.length == cibulka.length))
//        {
//            return -1;
//        }
        int count=0;
        for(int i=0; i<adamek.length; i++)
        {
            if(adamek[i] > barta[i]+cibulka[i])
            //if(adamek[i] > (adamek[i]+barta[i]+cibulka[i])/2d)
            {
                count++;
            }
        }
        return count;

    }
    /*
    * Prezidentských voleb se zůčastnili tři kandidáti:
    *  Adámek, Bárta a Cibulka. Říkáme, že kandidát ovládl
    * určitý volební okrsek, pokud zde získal více než polovinu
    * všech odevzdaných hlasů. Napište metodu s názvem
    * ovladlAdamek, která na vstupu má tři pole
    * typu int[]: adamek, barta a cibulka. Každé vstupní pole
    * obsahuje počty hlasů z jednotlivých okrsků pro daného
    * kandidáta. Výstup je počet okrsků, které ovládl Adámek.
    * Pokud nemají vstupní pole shodnou délku, výstup musí být -1.
     * */
}
