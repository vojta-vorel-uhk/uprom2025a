package uprom;

import java.util.Scanner;

public class Cviko08_Uloha04
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        if(isMuchSmaller(a,b))
            System.out.println("OK");
        else
            System.out.println("NOT OK");
    }

    public static boolean isMuchSmaller(double a, double b)
    {
        return a < b/100d;
    }
}
