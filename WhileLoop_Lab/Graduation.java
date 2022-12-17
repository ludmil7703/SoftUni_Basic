import java.util.Scanner;
public class Graduation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            int grade = 1;
            int poorgrade = 0;
            double sum = 0;
            while (grade <= 12) {
                double asses = Double.parseDouble(scanner.nextLine());
                if (asses >= 4.00) {
                    poorgrade = 0;
                    sum += asses;
                    grade++;
                } else {
                    poorgrade++;
                    if (poorgrade > 1) {
                        System.out.printf("%s has been excluded at %d grade", name, grade);
                        break;
                    }

                }
            }
            if (grade > 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);

            }
        }
}
