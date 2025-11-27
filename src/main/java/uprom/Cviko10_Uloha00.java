package uprom;

public class Cviko10_Uloha00
{
    public static void main(String[] args)
    {
        int[] numbers1 = new int[]{6,987,57,5};
        int[] numbers2 = new int[]{46,19587,1055,0,205};

        // Domácí cvičení: použít concat
        // a vypsat obsah výsledného pole
    }

    public static int[] concat(int[] a, int[] b)
    {
        int[] result = new int[a.length + b.length];
        for(int i=0; i<a.length; i++)
        {
            result[i] = a[i];
        }
        for(int i=0; i<b.length; i++)
        {
            result[a.length + i] = b[i];
        }
        return result;
    }

    // TODO:
    //  Doplň metodu, která spojí dvě pole do jednoho
}
