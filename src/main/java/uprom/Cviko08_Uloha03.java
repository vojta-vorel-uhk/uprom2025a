package uprom;

public class Cviko08_Uloha03
{
    public static void main(String[] args)
    {
        /*
         Udělej drobnou úpravu metody pocetDni, aby
         díky dalšímu vstupu vracela správnější výsledek
         */
    }

    public static int pocetDni(int mesic, boolean prestupny)
    {
        if(mesic==1 || mesic==3 || mesic==5 || mesic==7 || mesic==8 || mesic==10 || mesic==12)
            return 31;
        else if(mesic == 2 && prestupny)
            return 29;
        else if(mesic == 2 && !prestupny)
            return 28;
        else
            return 30;
    }
}
