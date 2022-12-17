import java.util.Scanner;
public class TennisRankList {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int tourNumber=Integer.parseInt(scanner.nextLine());
            int pointsNumber=Integer.parseInt(scanner.nextLine());
            int points=0;
            int win=0;
            for (int i=1;i<=tourNumber;i++){
                String etap= scanner.nextLine();
                if (etap.equals("W")){
                    points+=2000;
                    win++;
                }
                if (etap.equals("F")){
                    points+=1200;
                }
                if (etap.equals("SF")){
                    points+=720;
                }
            }
            System.out.printf("Final points: %d%n", pointsNumber+points);
            System.out.printf("Average points: %d%n", points/tourNumber);
            System.out.printf("%.2f%%",win*1.0/tourNumber*100);
        }
}
