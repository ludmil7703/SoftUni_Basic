import java.util.Scanner;
public class Salary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int openTabs = Integer.parseInt(scanner.nextLine());
            int salary = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= openTabs; i++) {
                String browser = scanner.nextLine();
                if (browser.equals("Facebook")) {
                    salary -= 150;
                }
                if (browser.equals("Instagram")) {
                    salary -= 100;
                }
                if (browser.equals("Reddit")) {
                    salary -= 50;
                }
                if (salary <= 0) {
                    i = openTabs;
                    System.out.println("You have lost your salary.");
                }

            }
            if (salary > 0) {
                System.out.println(salary);
            }
        }
}
