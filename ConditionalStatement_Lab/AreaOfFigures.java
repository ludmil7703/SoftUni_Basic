import java.util.Scanner;
public class AreaOfFigures {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String figure = scanner.nextLine();
            if (figure.equals("square")) {
                double a = Double.parseDouble(scanner.nextLine());
                double area = a*a;
                System.out.printf("%.3f",area);
            }
            if (figure.equals("rectangle")) {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                double area = a*b;
                System.out.printf("%.3f", area);
            }
            if (figure.equals("circle")) {
                double r = Double.parseDouble(scanner.nextLine());
                double area = Math.PI*r*r;
                System.out.printf("%.3f", area);
            }
            if (figure.equals("triangle")) {
                double a = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                double area = a*h/2;
                System.out.printf("%.3f", area);
            }
        }
}
