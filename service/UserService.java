import java.util.Calendar;

import Observer.ConcreteObservable;
import Observer.Observable;

public class UserService  implements DataService {
  Observable observable = new ConcreteObservable();

  @Override
  public Student createStudent(String name, String lastName, Calendar birthDay, int group, String speciality,
      double meanBall) {
    
    Student student = new Student(name, lastName, birthDay, group, speciality, meanBall);
    observable.registerStudent(student.getName());
    return student;
  }

  @Override
  public Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    Teacher teacher = new Teacher(name, lastName, birthDay, disciplines, rating, department);
    return teacher;
  }

}
