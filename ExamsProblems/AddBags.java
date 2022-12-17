import java.util.Scanner;
public class AddBags {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double luggageOver20=Double.parseDouble(scanner.nextLine());
            double kilogram=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int numberLuggage=Integer.parseInt(scanner.nextLine());
            double price=0.0;

            if (kilogram<10){
                price=luggageOver20*0.2;
            }
            if (kilogram>=10&&kilogram<=20){
                price=luggageOver20*0.5;
            }
            if (kilogram>20){
                price=luggageOver20;
            }
            if (days>30){
                price=price+price*0.1;
            }
            if (days>=7&&days<=30){
                price=price+price*0.15;
            }
            if (days<7){
                price=price+price*0.4;
            }
            price=price*numberLuggage;
            System.out.printf("The total price of bags is: %.2f lv.",price);
        }
}
