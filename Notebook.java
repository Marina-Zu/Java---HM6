package HW6;

import java.util.*;

public class Notebook {
    String name;
    int ozu;
    int hardDisk;
    String operatingSystem;
    String color;

    public Notebook(String name, int ozu, int hardDisk, String operatingSystem, String color) {
        this.name = name;
        this.ozu = ozu;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOzu() {
        return ozu;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Notebook)){    // Проверяем класс, который сравниваем
            return false;
        }
        Notebook note = (Notebook) obj; //Класс Object преобразуем в класс
        if (this.getName().equals(note.getName())){
           return true;
        }
        return false;
    }


    // создание метода фильтрации ноутбуков по критериям
    public static List<Notebook> filter(Set<Notebook> notebooks) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите параметры ноутбука \nПроизводитель: Acer, Asus, Apple");
        String enterName= scan.nextLine();
        System.out.println("Введите количество оперативной памяти в Гб: 8, 16 ");
        String enterOperativeMemory = scan.nextLine();
        int intParseOperativeMemory = Integer.parseInt(enterOperativeMemory);
        System.out.println("Введите объем жесткого диска в Гб: 512, 1024 ");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите операционную систем : Windows, Linux, MacOS");
        String enterOperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука: Черный, Белый");
        String enterColor = scan.nextLine();

        List<Notebook> listNote = new ArrayList<>();
        for (Notebook tempNote : notebooks) {
            if (enterName.equals(tempNote.name)) {
                if (intParseOperativeMemory == tempNote.ozu) {
                    if (intParseEnterHardDisk == tempNote.hardDisk) {
                        if (enterOperatingSystem.equals(tempNote.operatingSystem)) {
                            if (enterColor.equals(tempNote.color)) {
                                listNote.add(tempNote);
                            }
                        }
                    }
                }
            }
        }
        return listNote;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                "', ozu = " + ozu +
                ", hardDisk = " + hardDisk +
                ", operatingSystem '" + operatingSystem +
                "', color='" + color + '\'' +
                '}';
    }


}
