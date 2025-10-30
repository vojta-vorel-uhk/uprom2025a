package uprom;

import java.util.Scanner;

public class Cviko06_Uloha02b
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int upper = 1;
        while(n >= upper)
            upper = upper*10;
        System.out.println(
            "Zadali jste číslo mezi "
           + (upper / 10) + " a "+ upper);


//        int delka=0;
//        while(true)
//        {
//            delka++;
//            if(Integer.toString(n).length() == delka )
//            {
//                // Vypiš ...
//                break;
//            }
//        }


        // Z konzole načti přirozené číslo N
        // Podle toho, jak bylo velké, vypiš správnou hlášku, například:
        // "Zadali jste číslo mezi 1 a 10"
        // "Zadali jste číslo mezi 10 a 100"
        // "Zadali jste číslo mezi 100 a 1000"
        // "Zadali jste číslo mezi 1000 a 10000"
        //  atd.
    }
}
