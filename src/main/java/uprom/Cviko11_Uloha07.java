package uprom;

public class Cviko11_Uloha07
{
    public static void main(String[] args)
    {
        //TODO: Jaká bude hodnota proměnné ahoj?
        int ahoj = 5;
        ahoj = compute(grow(ahoj) + grow(1 + compute(ahoj)));
    }

    public static int compute(int number)
    {
        return 2*number;
    }

    public static int grow(int number)
    {
        return number + 2;
    }

}
