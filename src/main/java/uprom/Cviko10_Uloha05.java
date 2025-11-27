package uprom;

public class Cviko10_Uloha05
{
    public static void main(String[] args)
    {
        String[] texts = new String[1_000_000];
        Cviko10_Utils.fillExample(texts);
    }
    public static void insert(String[] t, String s, int index)
    {
        int count = Cviko10_Uloha04.count(t);
        //  posouvej prvky o jednu pozici
        //  doprava a začni od posledního
        for(int i=count-1; i >= index ; i--){
            t[i+1] = t[i];
        }
        //  Na uvolněnou pozici zapisujeme s
        t[index] = s;
    }

    // TODO:
    //  Doplň metodu, která vloží nový řetězec na danou pozici v kolekci

}
