import java.util.Scanner;
public class CatWalking {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int minutes=Integer.parseInt(scanner.nextLine());
            int walks=Integer.parseInt(scanner.nextLine());
            int caloriesForDay=Integer.parseInt(scanner.nextLine());

            int calories=walks*minutes*5;
            if (calories>=caloriesForDay*0.5){
                System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",calories);
            } else {
                System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",calories);
            }
        }
}
