import java.util.Calendar;

public class Controller {
    private DataService service = new UserService<>();

    public void createNewStudent(String name, String lastName, Calendar birthday, String group, String speciality,
            double averageMark) {
        service.createStudent(name, lastName, birthday, group, speciality, averageMark);
    }

    public void createnewTeacher(String name, String lastName, Calendar birthday, String disciplines, double rating,
            String department) {
        service.createTeacher(name, lastName, birthday, disciplines, rating, department);
    }


}
