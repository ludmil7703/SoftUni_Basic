import java.util.Scanner;
public class CareOfPuppy {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int food=Integer.parseInt(scanner.nextLine());
            food=food*1000;
            int food1=0;
            int sum=0;
            String input= scanner.nextLine();

            while (!input.equals("Adopted")){
                food1=Integer.parseInt(input);
                sum+=food1;

                input= scanner.nextLine();
            }
            if (food>=sum){
                System.out.printf("Food is enough! Leftovers: %d grams.",food-sum);
            } else {
                System.out.printf("Food is not enough. You need %d grams more.",sum-food);
            }
        }
}
