import java.util.ArrayList;
import java.util.Calendar;

public class UserService<T extends User> implements DataService<T>{

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

    @Override
    public ArrayList<T> readData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readData'");
    }




    
}