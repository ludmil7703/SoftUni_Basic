import java.util.Scanner;
public class BasketballEquipment {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int taxYears = Integer.parseInt(scanner.nextLine());
            double shoes = taxYears - (taxYears*0.4);
            double equip = shoes - (shoes*0.2);
            double ball = equip/4;
            double accessor = ball/5;
            double totalPrice = taxYears+shoes+equip+ball+accessor;
            System.out.println(totalPrice);
        }
    }
