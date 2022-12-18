package HW6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("Acer", 8, 1024, "Windows", "Черный");
        Notebook note2 = new Notebook("Acer", 8, 512, "Windows", "Черный");
        Notebook note3 = new Notebook("Acer", 16, 1024, "Windows", "Черный");
        Notebook note4 = new Notebook("Acer", 8, 512, "Linux", "Черный");
        Notebook note5 = new Notebook("Asus", 8, 512, "Linux", "Черный");
        Notebook note6 = new Notebook("Asus", 16, 512, "Windows", "Белый");
        Notebook note7 = new Notebook("Apple", 16, 1024, "MacOS", "Белый");
        Notebook note8 = new Notebook("Apple", 16, 512, "MacOS", "Белый");

        Set<Notebook> notes = new HashSet<>();
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        notes.add(note6);
        notes.add(note7);
        notes.add(note8);


        System.out.println(notes);

        List<Notebook> newNote = Notebook.filter(notes);
        if (newNote == null){
            System.out.println("Ноутбук с такими параметрами отсутствует");
        }
        else {
            System.out.println("Вам идеально подойдет: " + newNote);
        }
        //System.out.println("Вам идеально подойдет: " + Notebook.filter(notes));

    }

}
