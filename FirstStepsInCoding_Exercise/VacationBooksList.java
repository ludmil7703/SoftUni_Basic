import java.util.Scanner;
public class VacationBooksList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Broi stranici -");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Stranici prochita za chas - ");
            int pagesPerHour = Integer.parseInt(scanner.nextLine());
            System.out.println("Broi dni -");
            int days = Integer.parseInt(scanner.nextLine());
            int fullHours = pages/pagesPerHour;
            int hoursPerDay = fullHours/days;
            System.out.println(hoursPerDay);

        }
}
