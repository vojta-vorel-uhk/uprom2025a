package uprom;

public class Cviko11_Uloha08
{
    public static void main(String[] args)
    {
        //TODO: Jaká bude hodnota proměnné r?
        int[] a1 = new int[]{5,6,7};
        int r= method1(method2(a1,0), method2(a1,1));
    }

    public static int method2(int[] numbers, int p)
    {
        return numbers[p] + numbers[p+1];
    }

    public static int method1(int a, int b)
    {
        return a + b;
    }

}
