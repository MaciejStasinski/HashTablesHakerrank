package Project;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    String[] magazineTab= {"ive", "got", "a", "lovely", "bunch","of","coconuts"};
    String[] noteTab= {"ive", "got", "some", "coconuts"};
        ArrayList<String> magazineList = new ArrayList<String>();
        ArrayList<String> noteList = new ArrayList<String>();
        boolean possible =true;

    if (magazineTab.length<noteTab.length)
        System.out.println("No");
    else {
        for (int i=0;i<magazineTab.length;i++){
            magazineList.add(magazineTab[i]);
        }
        for (int i=0;i<noteTab.length;i++){
            noteList.add(noteTab[i]);
        }
        System.out.println(magazineList);
        System.out.println(noteList);

        for (int i=0;i<noteList.size();i++) {
            for (int j=0;j<magazineList.size();j++){
                if (noteList.get(i).hashCode()==magazineList.get(j).hashCode()){
                    magazineList.remove(j);
                    possible=true;
                    break;
                } else possible=false;
            }
            if (!possible) {
                System.out.println("No");
                break;
            }
        }
        if (possible)
            System.out.println("Yes");
    }







    }
}
