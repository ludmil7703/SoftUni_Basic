import java.util.Scanner;
public class GodzillaVsKong {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            int statsNumber = Integer.parseInt(scanner.nextLine());
            double wear = Double.parseDouble(scanner.nextLine());
            double decor = budget*0.1;
            double priceWear = statsNumber*wear;
            if (statsNumber>150) {
                priceWear=priceWear-(priceWear*0.1);
            }
            double price = priceWear+decor;
            if (price>budget) {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", (price-budget));
            }
            if (price<=budget) {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", (budget-price));
            }
        }
}
