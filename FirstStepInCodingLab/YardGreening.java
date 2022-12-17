import java.util.Scanner;

public class YardGreening {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kv. metri, koito shte badat ozeleneni -");
        double kvMetri=Double.parseDouble(scanner.nextLine());
        double price=kvMetri*7.61;
        double discount=price*0.18;
        double finalPrice=price-discount;
        System.out.print("The final price is: "+finalPrice+" lv.");
        System.out.println();
        System.out.print("The discount is: "+ discount+" lv.");
    }
}