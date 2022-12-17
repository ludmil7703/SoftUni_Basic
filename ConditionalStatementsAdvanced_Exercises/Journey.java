import java.util.Scanner;
public class Journey {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine();
            String place="";
            String destination="";
            double sum = 0.0;
            switch (season){
                case "summer":
                    place="Camp";
                    break;
                case "winter":
                    place="Hotel";
                    break;
            }
            if (budget <= 100) {
                destination = "Bulgaria";
                if (season.equals("summer")) {
                    sum = budget * 0.3;
                } else {
                    sum = budget * 0.7;
                }
            }
            if (budget <= 1000 && budget > 100){
                destination="Balkans";
                if (season.equals("summer")){
                    sum = budget * 0.4;
                } else {
                    sum = budget * 0.8;
                }

            }
            if (budget > 1000) {
                destination = "Europe";
                place = "Hotel";
                sum = budget * 0.9;
            }
            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f", place,sum);

        }
}
