package uprom;

public class Cviko09_Uloha02
{
    public static void main(String[] args)
    {
        int[] p = getInterval(3464646);
        System.out.println(p[4567]);
    }

    // TODO:
    //  Doplň a otestuj medotu, která vygeneruje pole
    //  po sobě jdoucích celých čísel, počínaje nulou
    public static int[] getInterval(int count)
    {
        int[] pole1 = new int[count];
        for(int i=0; i< pole1.length; i++)
        {
            pole1[i] = i;
        }
        return pole1;
    }

}
