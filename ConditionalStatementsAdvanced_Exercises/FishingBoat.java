import java.util.Scanner;
public class FishingBoat {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int budget=Integer.parseInt(scanner.nextLine());
            String season = scanner.nextLine();
            int fishManNumber=Integer.parseInt(scanner.nextLine());
            int rent = 0;
            double sum = 0.0;
            switch (season){
                case "Spring":
                    rent = 3000;
                    break;
                case "Summer":
                case "Autumn":
                    rent = 4200;
                    break;
                case "Winter":
                    rent = 2600;
                    break;
            }
            if (fishManNumber>=0&&fishManNumber<=6){
                sum = rent * 0.9;
            } else if (fishManNumber > 6 && fishManNumber <= 11){
                sum = rent * 0.85;
            } else {
                sum = rent * 0.75;
            }
            if (!season.equals("Autumn")&&fishManNumber%2==0){
                sum = sum * 0.95;
            }
            if (budget >= sum){
                System.out.printf("Yes! You have %.2f leva left.", budget - sum);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", sum - budget);
            }
        }
}
