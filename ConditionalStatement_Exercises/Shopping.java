import java.util.Scanner;
public class Shopping {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            int numberGpu = Integer.parseInt(scanner.nextLine());
            int numberProcessors = Integer.parseInt(scanner.nextLine());
            int numberRam = Integer.parseInt(scanner.nextLine());
            int priceGpu = 250;
            double priceProcessors=priceGpu*numberGpu*0.35;
            double priceRam = priceGpu*numberGpu*0.1;
            double price = priceGpu*numberGpu+priceProcessors*numberProcessors+priceRam*numberRam;
            if (numberGpu>numberProcessors) {
                price = price - (price*0.150);
            }
            if (budget>=price) {
                System.out.printf("You have %.2f leva left!", budget-price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva more!", price-budget);
            }

        }
}
