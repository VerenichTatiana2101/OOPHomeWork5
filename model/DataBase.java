import java.util.ArrayList;
import java.util.List;

public class DataBase<T extends User> {

  private List<Student> listStudents = new ArrayList<>();

  public void initStudents(List<Student> listStudents) {
    listStudents = listStudents;
  }

  private List<Teacher> listTeachers = new ArrayList<>();

  public void initTeachers(List<Teacher> listTeacher) {
    listTeacher = listTeacher;
  }

  public List<Student> getListStudents() {
    return listStudents;
  }

  public void setListStudents(List<Student> listStudents) {
    this.listStudents = listStudents;
  }

  public List<Teacher> getListTeachers() {
    return listTeachers;
  }

  public void setListTeachers(List<Teacher> listTeachers) {
    this.listTeachers = listTeachers;
  }

  @Override
  public String toString() {
    String result = "";
    for (Student student : listStudents) {
      result += student.toString() + "\n";
    }
    for (Teacher teacher : listTeachers) {
      result += teacher.toString() + "\n";
    }
    return result;
  }

}
