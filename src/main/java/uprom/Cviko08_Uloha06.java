package uprom;

public class Cviko08_Uloha06
{
    public static void main(String[] args)
    {
         /*
        Vytvoř a využij metodu, která
        spočítá délku daného řetězce, ale nepočítá mezery
        Např. pro "J. K. Rowling" vrátí 11
        */
        System.out.println(
                delkaBezMezer("J. K. Rowling"));
    }
    public static int delkaBezMezer(String s)
    {
        //return s.replace(" ","").length();
        int result=0;
        for (int i=0; i<s.length();i++)
            if(s.charAt(i) != ' ')
                result++;
        return result;
    }
}
