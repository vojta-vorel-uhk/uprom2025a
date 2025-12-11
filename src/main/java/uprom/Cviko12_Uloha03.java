package uprom;

public class Cviko12_Uloha03
{
    public static void main(String[] args)
    {

    }
    public static int[] swap(
            int[] p, int a, int b)
    {
        int[] result = new int[p.length];
        for(int i=0; i<result.length; i++){
            result[i] = p[i];
        }
        if(a>=0 && a<p.length && b>=0 && b<p.length) {
            int temp = result[a];
            result[a] = result[b];
            result[b] = temp;
        }

        return result;
    }
}
