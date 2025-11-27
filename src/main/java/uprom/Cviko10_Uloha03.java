package uprom;

public class Cviko10_Uloha03
{
    public static void main(String[] args)
    {
        String[] texts = new String[1_000_000];
        Cviko10_Utils.fillExample(texts);
        add(texts,"Nový string");
    }
    public static void add(String[] texts, String s)
    {
        for(int i=0; i <texts.length; i++) {
            if(texts[i] == null){
                texts[i] = s;
                break;
            }
        }
        // alternativně: uložit si i do proměnné freeIndex
        // a až za cyklem vložit s do pole
    }

    // TODO 2:
    //  Doplň metodu "add", která uloží daný string
    //  na vhodnou pozici v poli texts

}
