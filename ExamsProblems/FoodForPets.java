import java.util.Scanner;
public class FoodForPets {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int days=Integer.parseInt(scanner.nextLine());
            double food=Double.parseDouble(scanner.nextLine());
            double allCatFood=0.0;
            double allDogFood=0.0;
            double bisquits=0.0;

            for (int i=1;i<=days;i++){
                int dogFood=Integer.parseInt(scanner.nextLine());
                int catFood=Integer.parseInt(scanner.nextLine());
                allCatFood+=catFood;
                allDogFood+=dogFood;
                if (i%3==0){
                    bisquits+=(catFood+dogFood)*0.1;
                }
            }
            System.out.printf("Total eaten biscuits: %.0fgr.%n",bisquits);
            System.out.printf("%.2f%% of the food has been eaten.%n", (allCatFood+allDogFood)/food*100);
            System.out.printf("%.2f%% eaten from the dog.%n",allDogFood/(allCatFood+allDogFood)*100);
            System.out.printf("%.2f%% eaten from the cat.%n",allCatFood/(allCatFood+allDogFood)*100);
        }
}
