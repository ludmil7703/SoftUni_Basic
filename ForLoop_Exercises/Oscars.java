import java.util.Scanner;
public class Oscars {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String nameActor= scanner.nextLine();
            double points=Double.parseDouble(scanner.nextLine());
            int numberGrade=Integer.parseInt(scanner.nextLine());
            for (int i=1;i<=numberGrade;i++){
                String nameGrade= scanner.nextLine();
                double pointsGrade=Double.parseDouble(scanner.nextLine());
                int symb=nameGrade.length();
                points=points+((symb*pointsGrade)/2);
                if (points>1250.5){
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor,(points));
                    i=numberGrade;
                }
            }
            if (points<1250.5){
                System.out.printf("Sorry, %s you need %.1f more!",nameActor,(1250.5-points));
            }
        }
}
