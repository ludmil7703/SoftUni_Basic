import java.util.Scanner;
public class ChangeBureau {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int numberBitcoin=Integer.parseInt(scanner.nextLine());
            double chinaJuan=Double.parseDouble(scanner.nextLine());
            double commission=Double.parseDouble(scanner.nextLine());


            double bitcoin=numberBitcoin*1168;
            double juan=chinaJuan*0.15*1.76;
            double sum=(bitcoin+juan)/1.95;

            System.out.printf("%.2f",sum-(sum*commission)/100);
        }
}
