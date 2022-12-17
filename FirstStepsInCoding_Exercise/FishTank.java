import java.util.Scanner;
public class FishTank {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int length = Integer.parseInt(scanner.nextLine());
            int width = Integer.parseInt(scanner.nextLine());
            int high = Integer.parseInt(scanner.nextLine());
            double percent = Double.parseDouble(scanner.nextLine());
            int area = length * width * high;
            double areaLiters = area * 0.001;
            double liters = areaLiters*(1 - percent / 100.00);
            System.out.println(liters);
        }
    }
