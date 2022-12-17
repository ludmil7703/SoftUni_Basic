import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Брой на опаковките храна за кучета - ");
        int dogPack=Integer.parseInt(scanner.nextLine());
        System.out.println("Брой на опаковките храна за котки - ");
        int catPack=Integer.parseInt(scanner.nextLine());
        double sum = dogPack*2.5+catPack*4;
        System.out.print(sum+" lv.");
    }
}