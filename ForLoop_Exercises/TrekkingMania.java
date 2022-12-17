import java.util.Scanner;
public class TrekkingMania {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int numberGroup=Integer.parseInt(scanner.nextLine());
            int peopleMusala=0;
            int peopleMonblank=0;
            int peopleKilimanjaro=0;
            int peopleK2=0;
            int peopleEverest=0;
            int allpeople=0;

            for (int i=1;i<=numberGroup;i++){
                int numberPeople=Integer.parseInt(scanner.nextLine());
                allpeople+=numberPeople;
                if (numberPeople<=5){
                    peopleMusala+=numberPeople;
                }
                if (numberPeople>5&&numberPeople<=12){
                    peopleMonblank+=numberPeople;
                }
                if (numberPeople>12&&numberPeople<=25){
                    peopleKilimanjaro+=numberPeople;
                }
                if (numberPeople>25&&numberPeople<=40){
                    peopleK2+=numberPeople;
                }
                if (numberPeople>40){
                    peopleEverest+=numberPeople;
                }
            }
            double percMusala=peopleMusala*1.0/allpeople*100;
            double percMonblank=peopleMonblank*1.0/allpeople*100;
            double percKilimanjaro=peopleKilimanjaro*1.0/allpeople*100;
            double percK2=peopleK2*1.0/allpeople*100;
            double percEverest=peopleEverest*1.0/allpeople*100;


            System.out.printf("%.2f%%%n",percMusala);
            System.out.printf("%.2f%%%n",percMonblank);
            System.out.printf("%.2f%%%n",percKilimanjaro);
            System.out.printf("%.2f%%%n",percK2);
            System.out.printf("%.2f%%%n",percEverest);
        }
}
