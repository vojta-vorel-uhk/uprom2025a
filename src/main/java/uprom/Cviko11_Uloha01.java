package uprom;

import java.util.ArrayList;

public class Cviko11_Uloha01
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Německo");
        list1.add(0,"Francie");
        list1.add("Portugalsko");
        list1.remove(0);
        System.out.println(list1.get(1));

        // TODO
        //  Dokonči třídu Cviko11_List a otestuj ji
        Cviko11_List list2 = new Cviko11_List();
        list2.add("Německo");
        list2.insert(0,"Francie");
        list2.add("Portugalsko");
        list2.removeAt(0);
        System.out.println(list2.get(1));
    }
}
