import java.util.Scanner;
public class ToyShop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double excPrice = Double.parseDouble(scanner.nextLine());
            int puzzles = Integer.parseInt(scanner.nextLine());
            int kukli = Integer.parseInt(scanner.nextLine());
            int bears = Integer.parseInt(scanner.nextLine());
            int minions = Integer.parseInt(scanner.nextLine());
            int trucks = Integer.parseInt(scanner.nextLine());
            double price = puzzles*2.60+kukli*3.00+bears*4.10+minions*8.20+trucks*2.00;
            int number = puzzles+kukli+bears+minions+trucks;

            if (number>=50) {
                price = price - (price*0.25);
            }
            double naem = price*0.1;
            double total = price - naem;
            if (excPrice<=total) {
                double left = total-excPrice;
                System.out.printf("Yes! %.2f lv left.", left);
            }
            if (excPrice>total) {
                double left = excPrice-total;
                System.out.printf("Not enough money! %.2f lv needed.", left);
            }
        }
}
