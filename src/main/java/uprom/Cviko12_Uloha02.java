package uprom;

public class Cviko12_Uloha02
{
    public static void main(String[] args)
    {

    }
    public static void swap(
            int[] p, int a, int b)
    {
        if(a<0 || a>=p.length || b<0 || b>=p.length){
            return;
        }
        int temp = p[a];
        p[a] = p[b];
        p[b] = temp;
    }
}
