import java.util.Scanner;
public class AgencyProfit {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String airline= scanner.nextLine();
            int ticketOld=Integer.parseInt(scanner.nextLine());
            int ticketKids=Integer.parseInt(scanner.nextLine());
            double priceOld=Double.parseDouble(scanner.nextLine());
            double taxesServing=Double.parseDouble(scanner.nextLine());

            double priceKids=priceOld-priceOld*0.7;
            double allPrice=(ticketOld*priceOld+ticketKids*priceKids)+(ticketKids+ticketOld)*taxesServing;
            double profit=allPrice*0.2;
            System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airline,profit);
        }
}
