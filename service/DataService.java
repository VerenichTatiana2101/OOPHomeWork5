import java.util.ArrayList;
import java.util.Calendar;

public interface DataService<T> {

    Student createStudent(String name, String lastName, Calendar birthDay, int group, String speciality,
    double meanBall);

    Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
    String department, double rating);

    ArrayList<T> readData();
 
    
}