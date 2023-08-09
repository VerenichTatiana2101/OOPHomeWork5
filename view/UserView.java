import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserView {
    Controller controller = new Controller();

    public void choise() {
        System.out.println("Select the type of user to add:\n"
                + "1 - add a teacher\n"
                + "2 - add a student\n");
    }

    public int userCh(int userCh) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number 1 or 2.");
            while (!input.hasNextInt()) {
                System.out.println("Error! Please, enter a number.");
                input.next();
            }
            int userChoise = input.nextInt();
            return userChoise;
        }
    }

    public void addUser(int userChoise) {
        switch (userChoise) {
            case 1:
                addStudent();
                break;
            case 2:
                addTeacher();
                break;
            default:
                System.out.println("Error! Please, enter a number 1 or 2.");
        }
    }

    public void addTeacher() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a name: ");
        String name = input.nextLine();
        System.out.println("Input a last name: ");
        String lastName = input.nextLine();
        System.out.println("Input a birthday in the format: YEAR/MONTH/DATE: ");
        String[] tempDate = input.nextLine().split("/");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthday = new GregorianCalendar(year, month, date);
        System.out.println("Disciplines: ");
        String disciplines = input.next();
        System.out.println("Department: ");
        String department = input.next();
        System.out.println("Rating: ");
        Double rating = input.nextDouble();
        controller.createNewTeacher(name, lastName, birthday, disciplines, department, rating);
    }

    public void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a name: ");
        String name = input.nextLine();
        System.out.println("Input a last name: ");
        String lastName = input.nextLine();
        System.out.println("Input a birthday in the format: YEAR/MONTH/DATE: ");
        String[] tempDate = input.nextLine().split("/");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthday = new GregorianCalendar(year, month, date);
        System.out.println("Group: ");
        int group = input.nextInt();
        System.out.println("Speciality: ");
        String speciality = input.next();
        System.out.println("Mean Ball: ");
        Double meanBall = input.nextDouble();
        controller.createNewStudent(name, lastName, birthday, group, speciality, meanBall);
    }
}
