import java.util.Scanner;
public class SuppliesForSchool {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Broi paketi himikali");
            int penNumber=Integer.parseInt(scanner.nextLine());
            System.out.println("Broi paketi markeri");
            int markerNumber=Integer.parseInt(scanner.nextLine());
            System.out.println("Litri preparat za pochistvane na daska");
            int liters = Integer.parseInt(scanner.nextLine());
            System.out.println("Procent namalenie -");
            int percent = Integer.parseInt(scanner.nextLine());
            double suma = penNumber*5.80 + markerNumber*7.20 + liters*1.20;
            double price = suma - (suma*percent/100);
            System.out.println(price);
        }
}
