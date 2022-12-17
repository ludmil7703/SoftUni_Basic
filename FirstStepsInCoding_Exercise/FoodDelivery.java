import java.util.Scanner;
public class FoodDelivery {
        public static void main(String[] args) {
            Scanner scanner =  new Scanner(System.in);
            int chickenMenu = Integer.parseInt(scanner.nextLine());
            int fishMenu = Integer.parseInt(scanner.nextLine());
            int vegMenu = Integer.parseInt(scanner.nextLine());

            double priceMenu = chickenMenu*10.35 + fishMenu*12.40 + vegMenu*8.15;
            double desert = priceMenu*0.2;
            double totalPrice = priceMenu+desert+2.5;
            System.out.println(totalPrice);
        }
    }
