package uprom;

public class Cviko08_Uloha07
{
    public static void main(String[] args)
    {
         /*
        Vytvoř a využij metodu, která
        daný řetězec převede na velká písmena
        a na konec připojí daný počet vykřičníků
        */
    }
    public static String shout(
            String s, int exclamations)
    {
        String temp = s.toUpperCase();
        for(int i=0; i<exclamations; i++)
            temp = temp + "!";
        return temp;
    }
}
