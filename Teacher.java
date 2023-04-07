package Home_work5_oop_java;


import java.util.List;

public class Teacher implements Info {

    String name;  // имя
    String surname;     // фамилия
    String secondName;      // отчество
    String group;  // группа

    /**
     * Конструктор по присваиванию ФИО учителю по принятию значений в main
     * @param name  - имя
     * @param surname   - фамилия
     * @param secondName   - отчество
     */
    public Teacher(String name, String surname, String secondName,String group){
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.group = group;
    }

    /**
     * метод по получению ФИО и группы учителя
     * @return info - возвращение строки
     */
    private String getInfo(){
        String info = String.format(name + " " + surname + " " + secondName+ " " + group);
        return info;
    }

//    String info = String.format("ФИО преподавателя: %s %s %s группа: %s", name, surname, secondName,group);

    /**
     * перегруженый метод, который за основу берет медод "getInfo"
     *
     * @return
     */
    public String toString(){
        System.out.println(getInfo());
        return null;
    }

    /**
     * Метод получения фамилия и инициалов учителя
     * @substring - позволяет выбрать буквы в диапозоне
     * @param surname
     * @param name
     * @param secondName
     * @return
     */
    private String getShortNameTeacher(String surname, String name, String secondName){
        String str = surname + " " + name.substring(0,1) + "." + secondName.substring(0,1) + ".";
        return str;
    }

    /**
     * метод по выводу инициалов учителя
     */
    @Override
    public void showInfo() {
        String str = surname + " " + name.substring(0,1) + "." + secondName.substring(0,1) + ".";
        System.out.println("Teacher: " + str);
    }

    public String getGroup() {
        return group;
    }

    protected static void printList(List<Teacher> list){
        for (Teacher teacher : list){
            System.out.println(teacher);
        }
    }
}

