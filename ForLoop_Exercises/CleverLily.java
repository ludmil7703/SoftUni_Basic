import java.util.Scanner;
public class CleverLily {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int age = Integer.parseInt(scanner.nextLine());
            double washingMashine=Double.parseDouble(scanner.nextLine());
            int toysPrice=Integer.parseInt(scanner.nextLine());
            int toys=0;
            double moneyBD=0;
            int brother=0;
            for (int i=1; i<=age;i++){
                if (i%2==0){
                    if (i==2){
                        moneyBD=10;
                    }else {
                        moneyBD+=10.00*i/2;
                    }
                    brother++;

                }else{
                    toys++;
                }
            }
            double totalmoney=moneyBD+(toys*toysPrice)-brother;
            if (washingMashine<=totalmoney){
                System.out.printf("Yes! %.2f", totalmoney-washingMashine);
            }else {
                System.out.printf("No! %.2f",washingMashine-totalmoney);
            }
        }
}
