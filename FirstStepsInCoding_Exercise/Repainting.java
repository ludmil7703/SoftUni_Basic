import java.util.Scanner;
public class Repainting {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int naylon = Integer.parseInt(scanner.nextLine());
            int paint = Integer.parseInt(scanner.nextLine());
            int thinner = Integer.parseInt(scanner.nextLine());
            int workHours =Integer.parseInt(scanner.nextLine());
            int totalNylon = naylon+2;
            double totalPaint = paint+(paint*10/100.00);

            double priceM = totalNylon*1.5 + totalPaint*14.5 + thinner*5.00 + 0.4;
            double priceWorkman = (priceM*30/100)*workHours;
            double totalPrice = priceM + priceWorkman;
            System.out.println(totalPrice);

        }
    }
