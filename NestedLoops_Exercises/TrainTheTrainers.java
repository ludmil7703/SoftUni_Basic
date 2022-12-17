import java.util.Scanner;
public class TrainTheTrainers {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            String presentationName = scanner.nextLine();

            double middleGrade = 0.0;
            double sum=0.0;
            int count=0;

            while (!presentationName.equals("Finish")) {
                for (int i = 1; i <= n; i++) {
                    double grade = Double.parseDouble(scanner.nextLine());
                    middleGrade += grade;
                    count++;
                }
                System.out.printf("%s - %.2f.%n", presentationName, middleGrade / n);
                sum+=middleGrade;
                middleGrade=0.0;
                presentationName= scanner.nextLine();
            }
            System.out.printf("Student's final assessment is %.2f.%n",sum/count);

        }
}
