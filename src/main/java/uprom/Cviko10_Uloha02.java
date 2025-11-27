package uprom;

public class Cviko10_Uloha02
{
    public static void main(String[] args)
    {
        String[] texts = new String[1_000_000];
        Cviko10_Utils.fillExample(texts);
        System.out.println(texts[0]);
        System.out.println(texts[texts.length-1]);
        // TODO:
        //  Použij pole texts jako vstup do metody fillExample z Cviko10_Utils
        //  Pak vypiš první a poslední prvek pole
    }

}
