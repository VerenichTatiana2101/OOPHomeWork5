import java.util.ArrayList;
import java.util.Calendar;

public class UserService<T extends User>  implements DataService<T> {
  ArrayList<User> base = new ArrayList<>();

  @Override
  public Student createStudent(String name, String lastName, Calendar birthDay, int group, String speciality,
      double meanBall) {
    Student student = new Student(name, lastName, birthDay, group, speciality, meanBall);
    return student;
  }

  @Override
  public Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    Teacher teacher = new Teacher(name, lastName, birthDay, disciplines, rating, department);
    return teacher;
  }

  public void getTeachers() {
    for (User user : base) {
      if (user instanceof Teacher)
        System.out.print(user);
    }
  }

  public void getStudents() {
    for (User user : base) {
      if (user instanceof Student)
        System.out.print(user);
    }
  }

}
