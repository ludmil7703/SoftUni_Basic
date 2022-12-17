import java.util.Scanner;
public class HotelRoom {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String month = scanner.nextLine();
            int nightsNumber=Integer.parseInt(scanner.nextLine());
            double priceStudio = 0.0;
            double priceApartment = 0.0;
            double discountAp = 0.0;
            double discountStudio = 0.0;
            if (month.equals("May") || month.equals("October")){
                priceStudio = 50;
                priceApartment = 65;
                if (nightsNumber > 7 && nightsNumber < 14){
                    discountStudio = 0.05;
                } else if (nightsNumber > 14){
                    discountStudio = 0.3;
                }
            }
            if (month.equals("June") || month.equals("September")){
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (nightsNumber > 14){
                    discountStudio = 0.20;
                }
            }
            if (month.equals("July") || month.equals("August")){
                priceStudio = 76;
                priceApartment = 77;
            }
            if (nightsNumber > 14){
                discountAp = 0.1;
            }

            System.out.printf("Apartment: %.2f lv.", nightsNumber*(priceApartment-(priceApartment*discountAp)));
            System.out.println("");
            System.out.printf("Studio: %.2f lv.", nightsNumber*(priceStudio-(priceStudio*discountStudio)));
        }
}
