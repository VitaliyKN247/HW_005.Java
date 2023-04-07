package Home_work5_oop_java;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс со студентами. Имплементирован от интерфейса Info, в котором содержится метод по выводу информации о студенте
 * изначально создавал студентов не через массив, поэтому ввел статистическую переменную LAST_NUM_OF_STUDENTS, подсчитывающую порядковый номер студента
 * которая в свою очередь добавляла значения в numOfStudents, который ведет подсчет всех студентов.
 */
public class Student implements Info {
    int numOfStudents;  // порядковый номер студента
    static int LAST_NUM_OF_STUDENTS = 0;  // статистическая переменная подсчета порядкового номера
    String name;        // имя
    String surname;     // фамилия
    String secondName;  // отчество
    String group;  // группа


    /**
     * Конструктор
     * @param name - имя
     * @param surname  - фамилия
     * @param secondName - отчество
     */
    public Student(String name, String surname,String secondName, String group){
        numOfStudents = ++ LAST_NUM_OF_STUDENTS;
        this.secondName = secondName ;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    /**
     * Метод, позволяющий в перегруженном методе toString выводить ФИО
     * сначала сделал в типе возвращаемого значения Object, но и String прекрасно работает)
     * @return str - возвращение ФИО
     */
    private String getInintials(){
        String str = numOfStudents +  " ФИО: " + surname + " " + name + " " + secondName + " " + group;
        return str;
    }

    /**
     * перегрузка метода toString
     * @return - возварщение значения приведенного к строке в методе getInintials
     */
    public String toString(){
        return String.valueOf(getInintials());
    }

    /**
     * создание метода, который показывает информацию о ФИО людей через интерфейс "Info"
     */
    @Override
    public void showInfo() {
        System.out.println(String.format("Порядковый номер: %d\nФамилия %s Имя %s Отчество %s", numOfStudents,surname,name,secondName));
    }

    /**
     * Статистический метод по выводу всего массива студентов
     * @param list
     */
    protected static void printList(List<Student> list){
        for (Student students : list){
            System.out.println(students);
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
