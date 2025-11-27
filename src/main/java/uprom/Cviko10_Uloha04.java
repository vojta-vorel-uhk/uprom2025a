package uprom;

public class Cviko10_Uloha04
{
    public static void main(String[] args)
    {
        String[] texts = new String[1_000_000];
        Cviko10_Utils.fillExample(texts);
    }

    public static int count(String[] texts)
    {
        for(int i=0; i < texts.length; i++){
            if(texts[i] == null)
                return i;
        }
        return texts.length;
    }
    // TODO:
    //  Doplň metodu, která vrátí aktuální počet řetězců
    //  v kolekci

}
