import java.util.Scanner;
public class TradeCommissions {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String town = scanner.nextLine();
            double sells = Double.parseDouble(scanner.nextLine());
            double percent = 0;
            int isTown = 0;
            int isSells=0;
            if (sells >= 0 && sells <= 500) {
                switch (town) {
                    case "Sofia":
                        percent = 5;
                        break;
                    case "Varna":
                        percent = 4.5;
                        break;
                    case "Plovdiv":
                        percent = 5.5;
                        break;
                    default:
                        isTown=1;
                }
            }
            if (sells > 500 && sells <= 1000) {
                switch (town) {
                    case "Sofia":
                        percent = 7;
                        break;
                    case "Varna":
                        percent = 7.5;
                        break;
                    case "Plovdiv":
                        percent = 8;
                        break;
                    default:
                        isTown=1;
                }
            }
            if (sells > 1000 && sells <= 10000) {
                switch (town) {
                    case "Sofia":
                        percent = 8;
                        break;
                    case "Varna":
                        percent = 10;
                        break;
                    case "Plovdiv":
                        percent = 12;
                        break;
                    default:
                        isTown=1;
                }
            }
            if (sells > 10000) {
                switch (town) {
                    case "Sofia":
                        percent = 12;
                        break;
                    case "Varna":
                        percent = 13;
                        break;
                    case "Plovdiv":
                        percent = 14.5;
                        break;
                    default:
                        isTown = 1;
                }

            }
            if (sells <0 || isTown != 0) {
                System.out.println("error");
            }else {
                System.out.printf("%.02f",(sells * percent) / 100);
            }
        }
}
