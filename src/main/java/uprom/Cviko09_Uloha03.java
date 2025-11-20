package uprom;

public class Cviko09_Uloha03
{
    public static void main(String[] args)
    {
        int[] mojePole = new int[]{4,658,788,1566,5777,9789,8778,10604,15630,16884};
        System.out.println(isAscending(mojePole));
    }

    private static boolean isAscending(int[] mojePole) {
        for (int i=0; i<mojePole.length-1; i++){
            if(mojePole[i] > mojePole[i+1]){
                return false;
            }
        }
        return true;
    }


    // TODO:
    //  Vytvoř medotu isAscending, která otestuje, zda dané pole
    //  celých čísel je vzestupně seřazené

}
