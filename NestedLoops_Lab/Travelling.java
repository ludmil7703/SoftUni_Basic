import java.util.Scanner;
public class Travelling {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double budget=0.0;
            double moneyIn=0.0;
            String input= scanner.nextLine();

            while (!input.equals("End")){
                double sum=Double.parseDouble(scanner.nextLine());


                while (budget<sum){
                    moneyIn=Double.parseDouble(scanner.nextLine());
                    budget+=moneyIn;
                    String comand=String.valueOf(moneyIn);
                    if (comand.equals("End")){
                        break;
                    }
                }
                System.out.printf("Going to %s!%n",input);
                budget=0;
                input= scanner.nextLine();
            }
        }
}
