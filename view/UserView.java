import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserView {
    Controller controller = new Controller();
    Scanner input = new Scanner(System.in);

    public void addUser() {
        System.out.println("Select the type of user to add:\n"
                + "1 - add a teacher\n"
                + "2 - add a student\n"
                + "3 - search a student\n"
                + "4 - search a teacher\n");
        int userChoise;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number 1 or 4.");
            while (!input.hasNextInt()) {
                System.out.println("Error! Please, enter a number.");
                input.next();
            }
            userChoise = input.nextInt();
        }
        switch (userChoise) {
            case 1:
                addTeacher();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                controller.showStuden();
                break;
            case 4:
                controller.showTeacher();
                break;
            default:
                System.out.println("Error! Please, enter a number 1 to 4.");
        }
    }

    public void addTeacher() {
        System.out.print("Input a name: ");
        String name = input.nextLine();
        System.out.print("Input a last name: ");
        String lastName = input.nextLine();
        System.out.print("Input a birthday in the format: YEAR/MONTH/DATE: ");
        String[] tempDate = input.nextLine().split("/");
        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int date = Integer.parseInt(tempDate[2]);
        GregorianCalendar birthday = new GregorianCalendar(year, month, date);
        System.out.println("Disciplines: ");
        String disciplines = input.nextLine();
        System.out.println("Department: ");
        String department = input.nextLine();
        System.out.println("Rating: ");
        Double rating = input.nextDouble();
        controller.createNewTeacher(name, lastName, birthday, disciplines, department, rating);
    }

    public void addStudent() {
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
