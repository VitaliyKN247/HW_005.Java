package Home_work5_oop_java;

import java.util.ArrayList;
import java.util.List;

//import static Home_work5_oop_java.Student.printList;


public class Test {
    public static void main(String[] args) {
        // создание объекта класса через конструктор и методы вывода информации о нем
//        Teacher lenon = new Teacher("John", "Lenon","Sergeevich","458");
////          String shortNameLenon = lenon.getShortNameTeacher(lenon.name,lenon.surname,lenon.secondName);  // предыдущая версия создания инициалов в мэйн
//        // ( по причине практики по инкапсуляции)))
//        lenon.toString();
//
//        System.out.println("");
//        lenon.showInfo();


        // создание через массив
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("John", "Lenon","Sergeevich","458"));
        teachers.add(new Teacher("Arthur","Morgan","Leonidovich","121"));
        teachers.add(new Teacher("Kurt","Kobein","Leonidovich","131"));
//        Teacher.printList(teachers);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Freddy","Merkyri","Victorovic", "121"));
        students.add(new Student("Joisif","Stalin","Vissarionovich", "121"));
        students.add(new Student("Leonardo","Dicaprio","Nickolaevich","458"));
//        Student.printList(students);         // печать всего массива студентов
        System.out.println("-------");

        StudyGroupService groupServiceSt = new StudyGroupService();
        List<Student> a1 =  groupServiceSt.getStudentsInGroup(students,"458");
        for(Student x : a1)
            System.out.println(x);

        System.out.println("-------");

        StudyGroupService groupServiceTeach = new StudyGroupService();
        List<Teacher> t1 = groupServiceTeach.getTeachersInGroup(teachers,"458");
        for (Teacher y : t1)
            System.out.println(y);
        System.out.println("-----------");


        // незаконченный метод по сравнению массивов с определенной группой
//        List<StudyGroup> group = new ArrayList<>();
//        if(a1.equals(t1) == true){
//            System.out.println(t1);
//            System.out.println(a1);
//        }


        //создание через обощения
//        List<StudyGroupService> group = new ArrayList<>();
//        StudyGroup test = new StudyGroup();
//
//        Student st1 = new Student("Freddy","Merkyri","Victorovic");
//        Student st2 = new Student("Joisif","Stalin","Vissarionovich");
//        StudyGroup<Student> group = new StudyGroup<>(lenon,st1);
//        System.out.println(group.toString());



        // сырой тип
//        test = group;

        // end region










    }

    /**
     * метод интерфейса, который выводит фамилию и инициалы учителя/студента
     * @param info
     */
    private static void outPutInfo(Info info){
        info.showInfo();
    }

}
