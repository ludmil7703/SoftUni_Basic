import java.util.Scanner;
public class TennisEquipment {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double priceTennisRocket=Double.parseDouble(scanner.nextLine());
            int numberTR=Integer.parseInt(scanner.nextLine());
            int numberMaraton=Integer.parseInt(scanner.nextLine());

            double priceMaraton=priceTennisRocket/6;
            double middlePrice=numberTR*priceTennisRocket+numberMaraton*priceMaraton;
            double allPrice=middlePrice+middlePrice*0.2;


            System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(allPrice/8));
            System.out.printf("Price to be paid by sponsors %.0f%n",Math.ceil(allPrice*7/8));
        }
}
