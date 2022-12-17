import java.util.Scanner;
public class NewHouse {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            int gradus = Integer.parseInt(scanner.nextLine());
            String day = scanner.nextLine();
            String Outfit="";
            String Shoes="";
            if (gradus >= 10 && gradus <= 18){
                switch (day){
                    case "Morning":
                        Outfit="Sweatshirt";
                        Shoes="Sneakers";
                        break;
                    case "Afternoon":
                    case "Evening":
                        Outfit="Shirt";
                        Shoes="Moccasins";
                        break;

                }
            } else if (gradus > 18 && gradus <= 24){
                switch (day){
                    case "Morning":
                    case "Evening":
                        Outfit="Shirt";
                        Shoes="Moccasins";
                        break;
                    case "Afternoon":
                        Outfit="T-Shirt";
                        Shoes="Sandals";
                        break;
                }
            } else if (gradus >= 25){
                switch (day){
                    case "Morning":
                        Outfit="T-Shirt";
                        Shoes="Sandals";
                        break;
                    case "Afternoon":
                        Outfit="Swim Suit";
                        Shoes="Barefoot";
                        break;
                    case "Evening":
                        Outfit="Shirt";
                        Shoes="Moccasins";
                        break;
                }
            }
            System.out.printf("It's %d degrees, get your %s and %s.", gradus, Outfit, Shoes);
        }
}
