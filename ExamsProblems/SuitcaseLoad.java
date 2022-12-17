import java.util.Scanner;
public class SuitcaseLoad {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double capacity=Double.parseDouble(scanner.nextLine());
            double countCases=0.0;
            int count=0;

            String input= scanner.nextLine();

            while (!input.equals("End")){
                double cases=Double.parseDouble(input);
                count++;
                if (count%3==0){
                    cases=cases+cases*0.1;
                }
                countCases+=cases;
                if (capacity<countCases){
                    countCases-=cases;
                    count--;
                    System.out.println("No more space!");
                    break;
                }
                input= scanner.nextLine();
            }
            if (input.equals("End")){
                System.out.println("Congratulations! All suitcases are loaded!");
            }
            System.out.printf("Statistic: %d suitcases loaded.", count);
        }
}
