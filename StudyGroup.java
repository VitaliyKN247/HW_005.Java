package Home_work5_oop_java;

import java.util.ArrayList;
import java.util.List;

//вначале импортировал статистический метод testList в класс Student для инкапсуляции. Но работал он у меня только с модификатором доступа public, а тогда это бесмысслено
// поэтому оставил его в главном глассе с модификатором private. Это ведь считается защищенным от пользователя методом?)
//import static Home_work5_oop_java.Student.testList;

public class StudyGroup<T> {
     private Teacher teacher;   // поле учитель
     private T student;       // поле ученик

     /**
      * Конструктор
      * @param teacher - поле с класса учитель
      * @param student - поле с класса ученик
      */
     public StudyGroup(Teacher teacher, T student){
          this.teacher = teacher;
          this.student = student;
     }

     public StudyGroup(){
     }

     public Teacher getTeacher() {
          return teacher;
     }

     public void setTeacher(Teacher teacher) {
          this.teacher = teacher;
     }

     public T getStudent() {
          return student;
     }

     public void setStudent(T student) {
          this.student = student;
     }


}
