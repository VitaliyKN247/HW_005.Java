package Home_work5_oop_java;


import java.util.ArrayList;
import java.util.List;

/*
формирование учебных групп, в которой будут создаваться группы с преподавателями и учениками
 */
public class StudyGroupService{
    String group;  // строка группа
    List<Teacher> teacher;  // поле Учитель
    List<Student> students;     // поле ученик


    /**
     * вывод студентов с определенной группой
     * @param students - массив студентов
     * @param group - группа
     * @return - возвращение значения выборки из массива студентов тех, кто подходит под определеную группу
     */
    public List<Student> getStudentsInGroup(List<Student> students,String group){
        List<Student> res = new ArrayList<>();
        for(Student st: students){
            if(st.getGroup().equals(group))
            res.add(st);
        }
        return res;
    }

    /**
     * вывод учителей с определенной группой
     * @param teacher - массив учителей
     * @param group - группа
     * @return - возвращение значения выборки из массива учителей тех, кто подходит под определеную группу
     */
    public List<Teacher> getTeachersInGroup(List<Teacher> teacher,String group){
        List<Teacher> res1 = new ArrayList<>();
        for(Teacher t: teacher){
            if(t.getGroup().equals(group))
            res1.add(t);
        }
        return res1;
    }

}
