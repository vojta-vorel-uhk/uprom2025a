package uprom;

import java.io.FileNotFoundException;

public class Cviko11_Uloha02
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // TODO
        //  Doplň kód, který:
        //   - založí dvě pole typu int[], každé o délce 5
        //   - použije tato pole jako vstup do metody concat (ze třídy Cviko10_Uloha00)
        //     a vypíše délku pole, které se vrátilo jako výstup

        int[] p1 = new int[5];
        int[] p2 = {56,57,89,90,91};
        int[] c = Cviko10_Uloha00.concat(p1,p2);
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]);
            System.out.print(" ");
        }
    }
}
