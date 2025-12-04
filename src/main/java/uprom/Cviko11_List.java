package uprom;

public class Cviko11_List
{
    String[] texts = new String[1_000_000];
    int count = 0;

    public void add(String s) {
        for(int i=0; i <texts.length; i++) {
            if(texts[i] == null){
                texts[i] = s;
                break;
            }
        }
    }

    public void insert(int index, String s) {
        int count = Cviko10_Uloha04.count(texts);
        for(int i=count-1; i >= index ; i--){
            texts[i+1] = texts[i];
        }
        texts[index] = s;
    }

    public void removeAt(int i) {
        // TODO: doplnit, bude zde posouvání podobně jako v insert
    }

    public String get(int i) {
        return texts[i];
    }
}
