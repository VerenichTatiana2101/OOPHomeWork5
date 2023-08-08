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
        Scanner input = new Scanner(System.in);
        String name;
        String lastName;
        int id;
        String birthDay;
        String temp;
        String[] tempDate;
        int group;
        String speciality;
        Double meanBall;
        String disciplines;
        String department;
        Double rating;
        switch (userChoise) {
            case 1:
                System.out.println("Input a name: ");
                name = input.nextLine();
                System.out.println("Input a last name: ");
                lastName = input.nextLine();
                System.out.println("Input id: ");
                id = input.nextInt();
                System.out.println("Input a birthday in the format: YEAR/MONTH/DATE: ");
                tempDate = input.nextLine().split("/");
                int year = Integer.parseInt(tempDate[0]);
                int month = Integer.parseInt(tempDate[1]);
                int date = Integer.parseInt(tempDate[2]);
                GregorianCalendar birthday = new GregorianCalendar(year, month, date);
                System.out.println("Group: ");
                group = input.nextInt();
                System.out.println("Speciality: ");
                speciality = input.next();
                System.out.println("Mean Ball: ");
                meanBall = input.nextDouble();
                new Controller().createNewStudent(name, lastName, birthDay, group,
                speciality, meanBall);
                break;
            case 2:
                System.out.println("Имя: ");
                name = input.next();
                System.out.println("Фамилия: ");
                lastName = input.next();
                System.out.println("День рождения в формате: yyyy/mm/dd: ");
                tempDate = input.next().split("/");
                year = Integer.parseInt(tempDate[0]);
                month = Integer.parseInt(tempDate[1]);
                date = Integer.parseInt(tempDate[2]);
                birthday = new GregorianCalendar(year, month, date);
                System.out.println("Дисциплина: ");
                disciplines = input.next();
                System.out.println("Кафедра: ");
                department = input.next();
                System.out.println("Рейтинг: ");
                rating = input.nextDouble();
                new Controller().createNewTeacher(name, lastName, birthDay, disciplines, department, rating);
                break;
            default:
                System.out.println("Error! Please, enter a number 1 or 2.");
        }
    }
}
