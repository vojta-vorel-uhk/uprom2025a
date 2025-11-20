package uprom;

public class Cviko09_Uloha04
{
    public static void main(String[] args)
    {
        int[] inputs = {23,75,69,65,25,29,61,10,9,75,33,58,72,90,68,100,77,55,31,39,1};
        int count = countOf(inputs,75);
        System.out.println(count);
    }
    public static int countOf(int[] p, int value)
    {
        int result = 0;
        for(int i=0; i <p.length; i++){
            if(p[i] == value)
                result++;
        }
        return result;
    }

    // TODO:
    //  Vytvoř a otestuj medotu, která zjistí,
    //  kolikrát se v daném poli celých čísel
    //  vyskytuje daná hodnota
}
