import java.util.Calendar;

public class Controller {
    private DataService service = new UserService();

    public void createNewStudent(String name, String lastName, Calendar birthday, int group, String speciality,
            double meanBall) {
        service.createStudent(name, lastName, birthday, group, speciality, meanBall);
    }

    public void createNewTeacher(String name, String lastName, Calendar birthday, String disciplines,
            String department, double rating) {
        service.createTeacher(name, lastName, birthday, disciplines, department, rating);
    }


}
